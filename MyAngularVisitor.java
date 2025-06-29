package src.visitors;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import src.AST.*;
import src.AST.ComponentMetadata.CSS.*;
import src.AST.ComponentMetadata.ComponentMetadata;
import src.AST.ComponentMetadata.HTML.*;
import src.AST.ComponentMetadata.SelectorField;
import src.AST.ComponentMetadata.StylesField;
import src.AST.ComponentMetadata.TemplateField;
import src.AST.classes.ClassDecl;
import src.AST.classes.ClassMember;
import src.AST.classes.FieldDecl;
import src.AST.classes.MethodDecl;
import src.AST.expression.*;
import src.AST.statement.ExpressionStatement;
import src.AST.statement.Statement;
import src.antlr4.AngularComponentLexer;
import src.antlr4.AngularComponentParser;
import src.antlr4.AngularComponentParserBaseVisitor;
import src.symbolTable.*;

import java.util.ArrayList;
import java.util.List;

public class MyAngularVisitor extends AngularComponentParserBaseVisitor {

    private final SymbolTable globalScope = new SymbolTable();
    private SymbolTable currentScope = globalScope;

    public SymbolTable getGlobalScope() {
        return globalScope;
    }

    @Override
    public Object visitProgram(AngularComponentParser.ProgramContext ctx) {
        Program program = new Program();

        // Add all imports
        for (AngularComponentParser.ImportStmtContext importCtx : ctx.importStmt()) {
            ImportStmt importStmt = (ImportStmt) visit(importCtx);
            program.addImport(importStmt);
        }

        // Add interface if present
        if (ctx.interfaceDecl() != null) {
            InterfaceDecl interfaceDecl = (InterfaceDecl) visit(ctx.interfaceDecl());
            program.addInterface(interfaceDecl);
        }

        // Add component if present
        if (ctx.componentDecorator() != null) {
            ComponentDecorator component = (ComponentDecorator) visit(ctx.componentDecorator());
            program.addComponent(component);
        }

        // Add class if present
        if (ctx.classDecl() != null) {
            ClassDecl classDecl = (ClassDecl) visit(ctx.classDecl());
            program.addClass(classDecl);
        }

        return program;    }

    @Override
    public Object visitImportStmt(AngularComponentParser.ImportStmtContext ctx) {
        String lib = ctx.ID().getText();
        String from = ctx.STRING().getText();

        // Remove surrounding quotes
        from = from.substring(1, from.length() - 1);
        return new ImportStmt( lib , from) ;
    }

    @Override
    public Object visitComponentDecorator(AngularComponentParser.ComponentDecoratorContext ctx) {
        String componentName = ctx.ID().getText();

        AngularComponentParser.ComponentMetadataContext metadataCtx = ctx.componentMetadata();


        // Build and return AST node
        List<ComponentMetadata> metadataList = new ArrayList<>();

        for (AngularComponentParser.MetadataFieldContext fieldCtx : metadataCtx.metadataField()) {
            if (fieldCtx instanceof AngularComponentParser.SelectorFieldContext) {
                AngularComponentParser.SelectorFieldContext selectorCtx = (AngularComponentParser.SelectorFieldContext) fieldCtx;
                metadataList.add(  (SelectorField) visitSelectorField(selectorCtx)  );

            } else if (fieldCtx instanceof AngularComponentParser.TemplateFieldContext) {
                AngularComponentParser.TemplateFieldContext templateCtx = (AngularComponentParser.TemplateFieldContext) fieldCtx;
                metadataList.add((TemplateField) visitTemplateField(templateCtx));

            } else if (fieldCtx instanceof AngularComponentParser.StylesFieldContext) {
                AngularComponentParser.StylesFieldContext stylesCtx = (AngularComponentParser.StylesFieldContext) fieldCtx;
                metadataList.add( (StylesField) visitStylesField( stylesCtx ) );
            }
        }

        return new ComponentDecorator(componentName, metadataList); }

    @Override
    public Object visitComponentMetadata(AngularComponentParser.ComponentMetadataContext ctx) {
        return super.visitComponentMetadata(ctx);
    }

    @Override
    public Object visitSelectorField(AngularComponentParser.SelectorFieldContext ctx) {
        String selectorValue = ctx.STRING().getText();
        selectorValue = selectorValue.substring(1, selectorValue.length() - 1);

        return new SelectorField(selectorValue);
    }

    @Override
    public Object visitTemplateField(AngularComponentParser.TemplateFieldContext ctx) {
        TemplateField templateField = new TemplateField();
        List<Element> elements = new ArrayList<>();

        for (AngularComponentParser.ElementContext elementCtx : ctx.element()) {
            Element element = (Element) visit(elementCtx);
            elements.add(element);
        }

        templateField.setElement(elements);

        // Clear HTML tag stack after template parsing
        SymbolTable.clearHtmlTags();

        return templateField;
    }

    @Override
    public Object visitStylesField(AngularComponentParser.StylesFieldContext ctx) {
        CssBody cssBody = (CssBody) visit(ctx.cssBody());
        return new StylesField(cssBody);
    }

    @Override
    public Object visitInterfaceDecl(AngularComponentParser.InterfaceDeclContext ctx) {
        String name = ctx.ID().getText();
        List<InterfaceField> fields = new ArrayList<>();

        for (AngularComponentParser.InterfaceFieldContext fieldCtx : ctx.interfaceField()) {
            InterfaceField field = (InterfaceField) visit(fieldCtx);
            fields.add(field);
        }

        return new InterfaceDecl(name, fields);
    }

    @Override
    public Object visitInterfaceField(AngularComponentParser.InterfaceFieldContext ctx) {
        String fieldName = ctx.ID().getText();
        String fieldType = ctx.typeSpec().getText(); // crude example — improve later
        return new InterfaceField(fieldName, fieldType);
    }

    @Override
    public Object visitClassDecl(AngularComponentParser.ClassDeclContext ctx) {
        boolean isExported = ctx.getChild(0).getText().equals("export");
        String className = ctx.ID(0).getText();
        String superClass = null;

        if (ctx.getChildCount() > 3 && ctx.getChild(3).getText().equals("extends")) {
            superClass = ctx.ID(1).getText();
        }

        // Semantic Check: Add class to scope (may throw unchecked exception)
        ClassSymbol classSymbol = new ClassSymbol(className, superClass, isExported);
        try {
            currentScope.put(classSymbol); // May throw ItemAlreadyExistsException
        } catch (ItemAlreadyExistsException ex) {
            throw new RuntimeException(ex); // Wrap into unchecked exception
        }

        SymbolTable.pushScope(classSymbol.getClassScope());
        currentScope = classSymbol.getClassScope();

        List<ClassMember> members = new ArrayList<>();
        for (AngularComponentParser.ClassMemberContext memberCtx : ctx.classMember()) {
            if (memberCtx.fieldDecl() != null) {
                FieldDecl field = (FieldDecl) visitFieldDecl(memberCtx.fieldDecl());
                members.add(field);
            } else if (memberCtx.methodDecl() != null) {
                MethodDecl method = (MethodDecl) visitMethodDecl(memberCtx.methodDecl());
                members.add(method);
            }
        }

        SymbolTable.popScope();
        currentScope = SymbolTable.getCurrentScope();

        return new ClassDecl(isExported, className, superClass, null, members);
    }

    @Override
    public Object visitClassMember(AngularComponentParser.ClassMemberContext ctx) {
        return super.visitClassMember(ctx);
    }

    @Override
    public Object visitFieldDecl(AngularComponentParser.FieldDeclContext ctx) {
        String accessModifier = ctx.getChild(0) != null ? ctx.getChild(0).getText() : null;
        String name = ctx.ID().getText();
        String type = ctx.typeSpec().getText();
        boolean isOptional = false;
        boolean isRequired = false;

        Expression initializer = null;
        if (ctx.expression() != null) {
            initializer = (Expression) visitExpression(ctx.expression());
        }

        // Semantic Check: Add field to current scope
        FieldSymbol fieldSymbol = new FieldSymbol(name, type, accessModifier);
        try {
            currentScope.put(fieldSymbol); // may throw ItemAlreadyExistsException
        } catch (ItemAlreadyExistsException ex) {
            // Wrap into unchecked exception to avoid throws declaration
            throw new RuntimeException("Duplicate field name '" + name + "'", ex);
        }

        return new FieldDecl(accessModifier, name, type, isOptional, isRequired, initializer);

    }



    @Override
    public Object visitConstructorDecl(AngularComponentParser.ConstructorDeclContext ctx) {
        return super.visitConstructorDecl(ctx);
    }

    @Override
    public Object visitMethodDecl(AngularComponentParser.MethodDeclContext ctx) {
        String methodName = ctx.ID().getText();
        String returnType = ctx.typeSpec() != null ? ctx.typeSpec().getText() : "void";

        // Create symbol and insert into current scope
        MethodSymbol methodSymbol = new MethodSymbol(methodName, returnType);
        try {
            currentScope.put(methodSymbol); // May throw ItemAlreadyExistsException
            SymbolTable.pushScope(methodSymbol.getMethodScope());
            currentScope = methodSymbol.getMethodScope();

            // Visit method body
            List<Statement> body = new ArrayList<>();
            for (AngularComponentParser.StatementContext stmtCtx : ctx.statement()) {
                Statement stmt = (Statement) visitStatement(stmtCtx);
                if (stmt != null) {
                    body.add(stmt);
                }
            }

            // Exit method scope
            currentScope = SymbolTable.getCurrentScope().getParent();
            SymbolTable.popScope();

            return new MethodDecl(methodName, returnType, body);

        } catch (ItemAlreadyExistsException ex) {
            // Wrap checked exception to avoid throws declaration
            throw new RuntimeException("Duplicate method name '" + methodName + "'", ex);
        }
    }

    @Override
    public Object visitParameterList(AngularComponentParser.ParameterListContext ctx) {
        return super.visitParameterList(ctx);
    }

    @Override
    public Object visitParameter(AngularComponentParser.ParameterContext ctx) {
        return super.visitParameter(ctx);
    }

    @Override
    public Object visitTypeSpec(AngularComponentParser.TypeSpecContext ctx) {
        return super.visitTypeSpec(ctx);
    }

    @Override
    public Object visitGenericType(AngularComponentParser.GenericTypeContext ctx) {
        return super.visitGenericType(ctx);
    }

    @Override
    public Object visitArrayType(AngularComponentParser.ArrayTypeContext ctx) {
        return super.visitArrayType(ctx);
    }

    @Override
    public Object visitFunctionTypee(AngularComponentParser.FunctionTypeeContext ctx) {
        return super.visitFunctionTypee(ctx);
    }

    @Override
    public Object visitLiteralTypee(AngularComponentParser.LiteralTypeeContext ctx) {
        return super.visitLiteralTypee(ctx);
    }

    @Override
    public Object visitGroupedType(AngularComponentParser.GroupedTypeContext ctx) {
        return super.visitGroupedType(ctx);
    }

    @Override
    public Object visitFunctionType(AngularComponentParser.FunctionTypeContext ctx) {
        return super.visitFunctionType(ctx);
    }

    @Override
    public Object visitLiteralType(AngularComponentParser.LiteralTypeContext ctx) {
        return super.visitLiteralType(ctx);
    }

    public Object visitExpression(AngularComponentParser.ExpressionContext ctx) {
        if (ctx instanceof AngularComponentParser.PrimaryExpressionContext) {
            return visitPrimaryExpression((AngularComponentParser.PrimaryExpressionContext) ctx);

        } else if (ctx instanceof AngularComponentParser.PropertyAccessExpressionContext) {
            return visitPropertyAccessExpression((AngularComponentParser.PropertyAccessExpressionContext) ctx);

        } else if (ctx instanceof AngularComponentParser.FunctionCallExpressionContext) {
            return visitFunctionCallExpression((AngularComponentParser.FunctionCallExpressionContext) ctx);

        } else if (ctx instanceof AngularComponentParser.AssignmentExpressionContext) {
            return visitAssignmentExpression((AngularComponentParser.AssignmentExpressionContext) ctx);
        }
        // Add more cases as needed
        throw new UnsupportedOperationException("Unsupported expression type: " + ctx.getClass().getSimpleName());
    }

    @Override
    public Object visitAdditiveExpression(AngularComponentParser.AdditiveExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.expression(0));
        Expression right = (Expression) visit(ctx.expression(1));
        String operator = ctx.op.getText();
        return new AdditiveExpression(left, right, operator);
    }

    @Override
    public Object visitPrimaryExpression(AngularComponentParser.PrimaryExpressionContext ctx) {
        return visitPrimaryExpr(ctx.primaryExpr());
    }


    @Override
    public Object visitAssignmentExpression(AngularComponentParser.AssignmentExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.expression(0));
        Expression right = (Expression) visit(ctx.expression(1));
        return new AssignmentExpression(left, right);
    }

    @Override
    public Object visitIncrementExpression(AngularComponentParser.IncrementExpressionContext ctx) {
        Expression expr = (Expression) visit(ctx.expression());
        boolean isPostfix = ctx.Increment() != null &&
                ctx.Increment().getText().equals("++");
        return new IncrementExpression(expr, isPostfix);
    }

    @Override
    public Object visitPropertyAccessExpression(AngularComponentParser.PropertyAccessExpressionContext ctx) {
        Expression object = (Expression) visit(ctx.expression());
        String property = ctx.ID().getText();
        return new PropertyAccessExpression(object, property);
    }

    @Override
    public Object visitMultiplicativeExpression(AngularComponentParser.MultiplicativeExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.expression(0));
        Expression right = (Expression) visit(ctx.expression(1));
        String operator = ctx.op.getText();
        return new MultiplicativeExpression(left, right, operator);
    }

    @Override
    public Object visitFunctionCallExpression(AngularComponentParser.FunctionCallExpressionContext ctx) {
        Expression function = (Expression) visit(ctx.expression());
        List<Expression> arguments = new ArrayList<>();
        if (ctx.argumentList() != null) {
            for (AngularComponentParser.ExpressionContext argCtx : ctx.argumentList().expression()) {
                arguments.add((Expression) visit(argCtx));
            }
        }
        return new FunctionCallExpression(function, arguments);
    }

    @Override
    public Object visitPrimaryExpr(AngularComponentParser.PrimaryExprContext ctx) {
        PrimaryExpression result = new PrimaryExpression();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            // Case: THIS
            if (child instanceof TerminalNode && child.getText().equals("this")) {
                result.setExpression(new Expression());
                result.getExpression().setId("this");
                return result;
            }

            // Case: ID (variable name, identifier)
            if (child instanceof TerminalNode && ((TerminalNode) child).getSymbol().getType() == AngularComponentLexer.ID) {
                Expression expr = new Expression();
                expr.setId(child.getText());
                result.setExpression(expr);
                return result;
            }

            // Case: NUMBER
            if (child instanceof TerminalNode && ((TerminalNode) child).getSymbol().getType() == AngularComponentLexer.NUMBER) {
                Expression expr = new Expression();
                expr.setId(child.getText());
                result.setExpression(expr);
                return result;
            }

            // Case: STRING
            if (child instanceof TerminalNode && ((TerminalNode) child).getSymbol().getType() == AngularComponentLexer.STRING) {
                Expression expr = new Expression();
                expr.setId(child.getText());
                result.setExpression(expr);
                return result;
            }

            // Case: BOOLEAN (true / false)
            if (child instanceof TerminalNode && (
                    child.getText().equals("true") || child.getText().equals("false"))) {
                Expression expr = new Expression();
                expr.setId(child.getText());
                result.setExpression(expr);
                return result;
            }

            // Case: NULL
            if (child instanceof TerminalNode && child.getText().equals("null")) {
                Expression expr = new Expression();
                expr.setId("null");
                result.setExpression(expr);
                return result;
            }

            // Case: TEMPLATE_STRING
            if (child instanceof TerminalNode && ((TerminalNode) child).getSymbol().getType() == AngularComponentLexer.TEMPLATE_STRING) {
                Expression expr = new Expression();
                expr.setId(child.getText());
                result.setExpression(expr);
                return result;
            }

            // Case: '(' expression ')'
            if (child instanceof AngularComponentParser.ExpressionContext) {
                Expression inner = (Expression) visit(child);
                result.setExpression(inner);
                result.setOp(null); // or setOp("paren") if needed
                return result;
            }

            if (child instanceof AngularComponentParser.ArrayLiteralExpressionContext) {
                ArrayLiteralExpression arrayExpr = (ArrayLiteralExpression) visitArrayLiteralExpression(
                        (AngularComponentParser.ArrayLiteralExpressionContext) child
                );
                result.setArrayLiteralExpression(arrayExpr);
                return result;
            }


            // Case: objectLiteralExpression
            if (child instanceof AngularComponentParser.ObjectLiteralExpressionContext) {
                AngularComponentParser.ObjectLiteralExpressionContext objCtx =
                        (AngularComponentParser.ObjectLiteralExpressionContext) child;

                ObjectLiteralExpression expr = (ObjectLiteralExpression) visitObjectLiteralExpression(objCtx);
                result.setObjectLiteralExpression(expr); // if applicable
                return result;
            }
        }
        // Fallback
        return result;
    }

    @Override
    public Object visitArrayLiteralExpression(AngularComponentParser.ArrayLiteralExpressionContext ctx) {
        List<Expression> elements = new ArrayList<>();
        if (ctx.expression() != null) {
            for (AngularComponentParser.ExpressionContext exprCtx : ctx.expression()) {
                elements.add((Expression) visit(exprCtx));
            }
        }
        return new ArrayLiteralExpression(elements);
    }

    @Override
    public Object visitObjectLiteralExpression(AngularComponentParser.ObjectLiteralExpressionContext ctx) {
        List<ObjectLiteralPair> pairs = new ArrayList<>();
        if (ctx.objectLiteralPair() != null) {
            for (AngularComponentParser.ObjectLiteralPairContext pairCtx : ctx.objectLiteralPair()) {
                pairs.add((ObjectLiteralPair) visitObjectLiteralPair(pairCtx));
            }
        }
        return new ObjectLiteralExpression(pairs);
    }

    @Override
    public Object visitObjectLiteralPair(AngularComponentParser.ObjectLiteralPairContext ctx) {
        String key = ctx.ID().getText();
        Expression value = (Expression) visit(ctx.expression());
        return new ObjectLiteralPair(key, value);
    }

    @Override
    public Object visitArgumentList(AngularComponentParser.ArgumentListContext ctx) {
        List<Expression> arguments = new ArrayList<>();
        for (AngularComponentParser.ExpressionContext exprCtx : ctx.expression()) {
            arguments.add((Expression) visit(exprCtx));
        }
        return arguments;
    }

    @Override
    public Object visitStatement(AngularComponentParser.StatementContext ctx) {
        if (ctx.expressionStatement() != null) {

            return visitExpressionStatement(ctx.expressionStatement());
        } else if (ctx.blockStatement() != null) {

            return visitBlockStatement(ctx.blockStatement());
        }
        return null; // unreachable if grammar is correct
    }

    @Override
    public Object visitBlockStatement(AngularComponentParser.BlockStatementContext ctx) {
        return super.visitBlockStatement(ctx);
    }

    @Override
    public Object visitExpressionStatement(AngularComponentParser.ExpressionStatementContext ctx) {
        Expression expr1 = (Expression) visitExpression(ctx.expression());

        return new ExpressionStatement(expr1);
    }

    @Override
    public Object visitTagElement(AngularComponentParser.TagElementContext ctx) {
        return visitTag(ctx.tag());
    }

    @Override
    public Object visitHtmlName(AngularComponentParser.HtmlNameContext ctx) {
        HtmlNameElement htmlNameElement = new HtmlNameElement();
        htmlNameElement.setName(ctx.NAME_HTML().getText());
        return htmlNameElement;
    }

    @Override
    public Object visitInterpolationElement(AngularComponentParser.InterpolationElementContext ctx) {
        return visitInterpolation(ctx.interpolation());
    }

    @Override
    public Object visitTag(AngularComponentParser.TagContext ctx) {
        TagElement tagElement = new TagElement();

        // Case 1: Opening + Closing Tag
        if (ctx.openingTag() != null && ctx.closingTag() != null) {
            // Extract tag name from opening tag
            String openingTagName = ctx.openingTag().TAG_OPEN_START_HTML().getText().substring(1); // remove '<'
            // Push to stack
            SymbolTable.pushHtmlTag(openingTagName);

            // Build opening tag
            OpeningTag openingTag = new OpeningTag();
            for (AngularComponentParser.AttributesContext attrCtx : ctx.openingTag().attributes()) {
                Attributes attr = (Attributes) visit(attrCtx);
                openingTag.getAttributes().add(attr);
            }
            tagElement.setOpeningTag(openingTag);

            // Process inner elements
            List<Element> innerElements = new ArrayList<>();
            for (AngularComponentParser.ElementContext elementCtx : ctx.element()) {
                Element innerElement = (Element) visit(elementCtx);
                innerElements.add(innerElement);
            }
            tagElement.setElements(innerElements);

            // Extract closing tag name
            String closingTagName = ctx.closingTag().NAME_HTML().getText();

            // Validate closing tag
            try {
                SymbolTable.popAndValidateHtmlTag(closingTagName);
            } catch (TagMismatchException e) {
                throw new RuntimeException(e.getMessage());
            }

            // Build closing tag
            ClosingTag closingTag = new ClosingTag();
            closingTag.setNAME_HTML(closingTagName);
            tagElement.setClosingTag(closingTag);
        }
        // Case 2: Self-closing tag
        else if (ctx.selfClosingTag() != null) {
            SelfClosingTag selfClosingTag = new SelfClosingTag();
            for (AngularComponentParser.AttributesContext attrCtx : ctx.selfClosingTag().attributes()) {
                Attributes attr = (Attributes) visit(attrCtx);
                selfClosingTag.getAttributes().add(attr);
            }
            tagElement.setSelfClosingTag(selfClosingTag);
        }

        return tagElement;
    }

    @Override
    public Object visitOpeningTag(AngularComponentParser.OpeningTagContext ctx) {
        return super.visitOpeningTag(ctx);
    }

    @Override
    public Object visitClosingTag(AngularComponentParser.ClosingTagContext ctx) {
        return super.visitClosingTag(ctx);
    }

    @Override
    public Object visitSelfClosingTag(AngularComponentParser.SelfClosingTagContext ctx) {
        return super.visitSelfClosingTag(ctx);
    }

    @Override
    public Object visitRegularAttribute(AngularComponentParser.RegularAttributeContext ctx) {
        String attributeName = ctx.NAME_HTML().getText();

        if (!HtmlAttributeValidator.isValidHtmlAttribute(attributeName)) {
            throw new RuntimeException("Invalid HTML attribute name: " + attributeName);
        }

        Attributes attr = new Attributes();
        attr.setHtmlName(attributeName);
        String value = ctx.STRING_HTML().getText();
        attr.setHtmlString(value.substring(1, value.length() - 1)); // Remove quotes
        return attr;
    }


    @Override
    public Object visitStructuralDirectiveAttribute(AngularComponentParser.StructuralDirectiveAttributeContext ctx) {
        String directive = ctx.STRUCTURAL_DIR_HTML().getText();

        if (!HtmlAttributeValidator.isValidHtmlAttribute("*" + directive)) {
            throw new RuntimeException("Invalid structural directive: " + directive);
        }

        Attributes attr = new Attributes();
        attr.setStructuralDir(directive + "=" + ctx.STRING_HTML().getText());
        return attr;
    }

    @Override
    public Object visitPropertyBindingAttribute(AngularComponentParser.PropertyBindingAttributeContext ctx) {
        Attributes attr = new Attributes();
        attr.setBinding(ctx.BINDING_HTML().getText() + "=" +
                ctx.STRING_HTML().getText());
        return attr;
    }

    @Override
    public Object visitEventBindingAttribute(AngularComponentParser.EventBindingAttributeContext ctx) {
        Attributes attr = new Attributes();
        attr.setEvent(ctx.EVENT_BINDING_HTML().getText() + "=" +
                ctx.STRING_HTML().getText());
        return attr;
    }

    @Override
    public Object visitInterpolation(AngularComponentParser.InterpolationContext ctx) {
        String interpolatedValue = ctx.NAME_HTML().getText();
        return new InterpolationElement(interpolatedValue);
    }

    @Override
    public Object visitCssBodyContent(AngularComponentParser.CssBodyContentContext ctx) {
        CssBody cssBody = new CssBody();
        CssObjects cssObjects = (CssObjects) visit(ctx.cssObjects());
        cssBody.setCssObjects(cssObjects);
        return cssBody;
    }

    @Override
    public Object visitCssObjectList(AngularComponentParser.CssObjectListContext ctx) {
        CssObjects cssObjects = new CssObjects();
        List<CssElement> elements = new ArrayList<>();

        for (AngularComponentParser.CsselementContext elementCtx : ctx.csselement()) {
            CssElement element = (CssElement) visit(elementCtx);
            elements.add(element);
        }

        cssObjects.setCssElementlist(elements);
        return cssObjects;
    }

    @Override
    public Object visitCssRule(AngularComponentParser.CssRuleContext ctx) {
        CssElement cssElement = new CssElement();
        List<CssElementBody> elementBodies = new ArrayList<>();

        for (AngularComponentParser.BodyelementContext bodyCtx : ctx.bodyelement()) {
            CssElementBody elementBody = (CssElementBody) visit(bodyCtx);
            elementBodies.add(elementBody);
        }

        cssElement.setBodyCssElements(elementBodies);
        return cssElement;
    }

    @Override
    public Object visitCssProperty(AngularComponentParser.CssPropertyContext ctx) {
        String propertyName = ctx.ID_CSS().getText();

        if (!HtmlAttributeValidator.isValidCssProperty(propertyName)) {
            throw new RuntimeException("Invalid CSS property: " + propertyName);
        }

        CssElementBody elementBody = new CssElementBody();
        elementBody.setId_css(propertyName);

        CssValue cssValue = (CssValue) visit(ctx.cssValue());
        elementBody.setCssValue(cssValue);

        return elementBody;
    }

    @Override
    public Object visitCssValueExpression(AngularComponentParser.CssValueExpressionContext ctx) {
        CssValue cssValue = new CssValue();
        List<String> values = new ArrayList<>();

        if (ctx.PERCENT() != null) {
            values.add(ctx.PERCENT().getText());
        }

        for (TerminalNode id : ctx.ID_CSS()) {
            values.add(id.getText());
        }

        cssValue.setID_CSS(values);
        return cssValue;
    }
}
