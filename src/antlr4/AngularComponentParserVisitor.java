// Generated from AngularComponentParser.g4 by ANTLR 4.13.1
package src.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularComponentParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularComponentParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularComponentParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(AngularComponentParser.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#componentDecorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDecorator(AngularComponentParser.ComponentDecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#componentMetadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentMetadata(AngularComponentParser.ComponentMetadataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorField}
	 * labeled alternative in {@link AngularComponentParser#metadataField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorField(AngularComponentParser.SelectorFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateField}
	 * labeled alternative in {@link AngularComponentParser#metadataField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateField(AngularComponentParser.TemplateFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StylesField}
	 * labeled alternative in {@link AngularComponentParser#metadataField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesField(AngularComponentParser.StylesFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#interfaceDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDecl(AngularComponentParser.InterfaceDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#interfaceField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceField(AngularComponentParser.InterfaceFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(AngularComponentParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(AngularComponentParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(AngularComponentParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#constructorDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDecl(AngularComponentParser.ConstructorDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(AngularComponentParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(AngularComponentParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AngularComponentParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpec(AngularComponentParser.TypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenericType}
	 * labeled alternative in {@link AngularComponentParser#primaryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericType(AngularComponentParser.GenericTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link AngularComponentParser#primaryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(AngularComponentParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionTypee}
	 * labeled alternative in {@link AngularComponentParser#primaryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypee(AngularComponentParser.FunctionTypeeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralTypee}
	 * labeled alternative in {@link AngularComponentParser#primaryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralTypee(AngularComponentParser.LiteralTypeeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GroupedType}
	 * labeled alternative in {@link AngularComponentParser#primaryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupedType(AngularComponentParser.GroupedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(AngularComponentParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#literalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralType(AngularComponentParser.LiteralTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(AngularComponentParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(AngularComponentParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(AngularComponentParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncrementExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementExpression(AngularComponentParser.IncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyAccessExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccessExpression(AngularComponentParser.PropertyAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(AngularComponentParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link AngularComponentParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(AngularComponentParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(AngularComponentParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#arrayLiteralExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralExpression(AngularComponentParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#objectLiteralExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralExpression(AngularComponentParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#objectLiteralPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralPair(AngularComponentParser.ObjectLiteralPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(AngularComponentParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AngularComponentParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(AngularComponentParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(AngularComponentParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagElement}
	 * labeled alternative in {@link AngularComponentParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagElement(AngularComponentParser.TagElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlName}
	 * labeled alternative in {@link AngularComponentParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlName(AngularComponentParser.HtmlNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterpolationElement}
	 * labeled alternative in {@link AngularComponentParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolationElement(AngularComponentParser.InterpolationElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(AngularComponentParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#openingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpeningTag(AngularComponentParser.OpeningTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#closingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosingTag(AngularComponentParser.ClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(AngularComponentParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegularAttribute}
	 * labeled alternative in {@link AngularComponentParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularAttribute(AngularComponentParser.RegularAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructuralDirectiveAttribute}
	 * labeled alternative in {@link AngularComponentParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuralDirectiveAttribute(AngularComponentParser.StructuralDirectiveAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyBindingAttribute}
	 * labeled alternative in {@link AngularComponentParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBindingAttribute(AngularComponentParser.PropertyBindingAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EventBindingAttribute}
	 * labeled alternative in {@link AngularComponentParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBindingAttribute(AngularComponentParser.EventBindingAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularComponentParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(AngularComponentParser.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssBodyContent}
	 * labeled alternative in {@link AngularComponentParser#cssBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBodyContent(AngularComponentParser.CssBodyContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssObjectList}
	 * labeled alternative in {@link AngularComponentParser#cssObjects}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssObjectList(AngularComponentParser.CssObjectListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssRule}
	 * labeled alternative in {@link AngularComponentParser#csselement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(AngularComponentParser.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssProperty}
	 * labeled alternative in {@link AngularComponentParser#bodyelement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssProperty(AngularComponentParser.CssPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueExpression}
	 * labeled alternative in {@link AngularComponentParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueExpression(AngularComponentParser.CssValueExpressionContext ctx);
}