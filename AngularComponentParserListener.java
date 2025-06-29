// Generated from AngularComponentParser.g4 by ANTLR 4.13.1
package src.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularComponentParser}.
 */
public interface AngularComponentParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularComponentParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularComponentParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(AngularComponentParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(AngularComponentParser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#componentDecorator}.
	 * @param ctx the parse tree
	 */
	void enterComponentDecorator(AngularComponentParser.ComponentDecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#componentDecorator}.
	 * @param ctx the parse tree
	 */
	void exitComponentDecorator(AngularComponentParser.ComponentDecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#componentMetadata}.
	 * @param ctx the parse tree
	 */
	void enterComponentMetadata(AngularComponentParser.ComponentMetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#componentMetadata}.
	 * @param ctx the parse tree
	 */
	void exitComponentMetadata(AngularComponentParser.ComponentMetadataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorField}
	 * labeled alternative in {@link AngularComponentParser#metadataField}.
	 * @param ctx the parse tree
	 */
	void enterSelectorField(AngularComponentParser.SelectorFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorField}
	 * labeled alternative in {@link AngularComponentParser#metadataField}.
	 * @param ctx the parse tree
	 */
	void exitSelectorField(AngularComponentParser.SelectorFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateField}
	 * labeled alternative in {@link AngularComponentParser#metadataField}.
	 * @param ctx the parse tree
	 */
	void enterTemplateField(AngularComponentParser.TemplateFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateField}
	 * labeled alternative in {@link AngularComponentParser#metadataField}.
	 * @param ctx the parse tree
	 */
	void exitTemplateField(AngularComponentParser.TemplateFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StylesField}
	 * labeled alternative in {@link AngularComponentParser#metadataField}.
	 * @param ctx the parse tree
	 */
	void enterStylesField(AngularComponentParser.StylesFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StylesField}
	 * labeled alternative in {@link AngularComponentParser#metadataField}.
	 * @param ctx the parse tree
	 */
	void exitStylesField(AngularComponentParser.StylesFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#interfaceDecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDecl(AngularComponentParser.InterfaceDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#interfaceDecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDecl(AngularComponentParser.InterfaceDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#interfaceField}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceField(AngularComponentParser.InterfaceFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#interfaceField}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceField(AngularComponentParser.InterfaceFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(AngularComponentParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(AngularComponentParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(AngularComponentParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(AngularComponentParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(AngularComponentParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(AngularComponentParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#constructorDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDecl(AngularComponentParser.ConstructorDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#constructorDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDecl(AngularComponentParser.ConstructorDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(AngularComponentParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(AngularComponentParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(AngularComponentParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(AngularComponentParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AngularComponentParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AngularComponentParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(AngularComponentParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(AngularComponentParser.TypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericType}
	 * labeled alternative in {@link AngularComponentParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void enterGenericType(AngularComponentParser.GenericTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericType}
	 * labeled alternative in {@link AngularComponentParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void exitGenericType(AngularComponentParser.GenericTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link AngularComponentParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(AngularComponentParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link AngularComponentParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(AngularComponentParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionTypee}
	 * labeled alternative in {@link AngularComponentParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypee(AngularComponentParser.FunctionTypeeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionTypee}
	 * labeled alternative in {@link AngularComponentParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypee(AngularComponentParser.FunctionTypeeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralTypee}
	 * labeled alternative in {@link AngularComponentParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void enterLiteralTypee(AngularComponentParser.LiteralTypeeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralTypee}
	 * labeled alternative in {@link AngularComponentParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void exitLiteralTypee(AngularComponentParser.LiteralTypeeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GroupedType}
	 * labeled alternative in {@link AngularComponentParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void enterGroupedType(AngularComponentParser.GroupedTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GroupedType}
	 * labeled alternative in {@link AngularComponentParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void exitGroupedType(AngularComponentParser.GroupedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(AngularComponentParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(AngularComponentParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#literalType}.
	 * @param ctx the parse tree
	 */
	void enterLiteralType(AngularComponentParser.LiteralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#literalType}.
	 * @param ctx the parse tree
	 */
	void exitLiteralType(AngularComponentParser.LiteralTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(AngularComponentParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(AngularComponentParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(AngularComponentParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(AngularComponentParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(AngularComponentParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(AngularComponentParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncrementExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIncrementExpression(AngularComponentParser.IncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncrementExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIncrementExpression(AngularComponentParser.IncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyAccessExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccessExpression(AngularComponentParser.PropertyAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyAccessExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccessExpression(AngularComponentParser.PropertyAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(AngularComponentParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(AngularComponentParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(AngularComponentParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(AngularComponentParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(AngularComponentParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(AngularComponentParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#arrayLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpression(AngularComponentParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#arrayLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpression(AngularComponentParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#objectLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpression(AngularComponentParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#objectLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpression(AngularComponentParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#objectLiteralPair}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralPair(AngularComponentParser.ObjectLiteralPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#objectLiteralPair}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralPair(AngularComponentParser.ObjectLiteralPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(AngularComponentParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(AngularComponentParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AngularComponentParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AngularComponentParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(AngularComponentParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(AngularComponentParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(AngularComponentParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(AngularComponentParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagElement}
	 * labeled alternative in {@link AngularComponentParser#element}.
	 * @param ctx the parse tree
	 */
	void enterTagElement(AngularComponentParser.TagElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagElement}
	 * labeled alternative in {@link AngularComponentParser#element}.
	 * @param ctx the parse tree
	 */
	void exitTagElement(AngularComponentParser.TagElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlName}
	 * labeled alternative in {@link AngularComponentParser#element}.
	 * @param ctx the parse tree
	 */
	void enterHtmlName(AngularComponentParser.HtmlNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlName}
	 * labeled alternative in {@link AngularComponentParser#element}.
	 * @param ctx the parse tree
	 */
	void exitHtmlName(AngularComponentParser.HtmlNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterpolationElement}
	 * labeled alternative in {@link AngularComponentParser#element}.
	 * @param ctx the parse tree
	 */
	void enterInterpolationElement(AngularComponentParser.InterpolationElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterpolationElement}
	 * labeled alternative in {@link AngularComponentParser#element}.
	 * @param ctx the parse tree
	 */
	void exitInterpolationElement(AngularComponentParser.InterpolationElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(AngularComponentParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(AngularComponentParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#openingTag}.
	 * @param ctx the parse tree
	 */
	void enterOpeningTag(AngularComponentParser.OpeningTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#openingTag}.
	 * @param ctx the parse tree
	 */
	void exitOpeningTag(AngularComponentParser.OpeningTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#closingTag}.
	 * @param ctx the parse tree
	 */
	void enterClosingTag(AngularComponentParser.ClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#closingTag}.
	 * @param ctx the parse tree
	 */
	void exitClosingTag(AngularComponentParser.ClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(AngularComponentParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(AngularComponentParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegularAttribute}
	 * labeled alternative in {@link AngularComponentParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterRegularAttribute(AngularComponentParser.RegularAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularAttribute}
	 * labeled alternative in {@link AngularComponentParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitRegularAttribute(AngularComponentParser.RegularAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructuralDirectiveAttribute}
	 * labeled alternative in {@link AngularComponentParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterStructuralDirectiveAttribute(AngularComponentParser.StructuralDirectiveAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructuralDirectiveAttribute}
	 * labeled alternative in {@link AngularComponentParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitStructuralDirectiveAttribute(AngularComponentParser.StructuralDirectiveAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyBindingAttribute}
	 * labeled alternative in {@link AngularComponentParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBindingAttribute(AngularComponentParser.PropertyBindingAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyBindingAttribute}
	 * labeled alternative in {@link AngularComponentParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBindingAttribute(AngularComponentParser.PropertyBindingAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EventBindingAttribute}
	 * labeled alternative in {@link AngularComponentParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterEventBindingAttribute(AngularComponentParser.EventBindingAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EventBindingAttribute}
	 * labeled alternative in {@link AngularComponentParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitEventBindingAttribute(AngularComponentParser.EventBindingAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularComponentParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(AngularComponentParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularComponentParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(AngularComponentParser.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssBodyContent}
	 * labeled alternative in {@link AngularComponentParser#cssBody}.
	 * @param ctx the parse tree
	 */
	void enterCssBodyContent(AngularComponentParser.CssBodyContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssBodyContent}
	 * labeled alternative in {@link AngularComponentParser#cssBody}.
	 * @param ctx the parse tree
	 */
	void exitCssBodyContent(AngularComponentParser.CssBodyContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssObjectList}
	 * labeled alternative in {@link AngularComponentParser#cssObjects}.
	 * @param ctx the parse tree
	 */
	void enterCssObjectList(AngularComponentParser.CssObjectListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssObjectList}
	 * labeled alternative in {@link AngularComponentParser#cssObjects}.
	 * @param ctx the parse tree
	 */
	void exitCssObjectList(AngularComponentParser.CssObjectListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssRule}
	 * labeled alternative in {@link AngularComponentParser#csselement}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(AngularComponentParser.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssRule}
	 * labeled alternative in {@link AngularComponentParser#csselement}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(AngularComponentParser.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssProperty}
	 * labeled alternative in {@link AngularComponentParser#bodyelement}.
	 * @param ctx the parse tree
	 */
	void enterCssProperty(AngularComponentParser.CssPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssProperty}
	 * labeled alternative in {@link AngularComponentParser#bodyelement}.
	 * @param ctx the parse tree
	 */
	void exitCssProperty(AngularComponentParser.CssPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueExpression}
	 * labeled alternative in {@link AngularComponentParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueExpression(AngularComponentParser.CssValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueExpression}
	 * labeled alternative in {@link AngularComponentParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueExpression(AngularComponentParser.CssValueExpressionContext ctx);
}