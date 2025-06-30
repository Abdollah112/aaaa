package src.AST.statement;

import src.AST.expression.Expression;

public class ExpressionStatement implements Statement {
    private final Expression expression;

    public ExpressionStatement(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return expression + ";";
    }
}