package src.AST.statement;

import src.AST.Node;
import src.AST.expression.Expression;

public class ExpressionStatement extends Node implements Statement {
    private final Expression expression;

    public ExpressionStatement(int lineNumber, int columnNumber, Expression expression) {
        super(lineNumber, columnNumber);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public String generateJS() {
        if (expression == null) return "";
        return expression.generateJS() + ";";
    }

    @Override
    public String toString() {
        return expression + ";";
    }
}