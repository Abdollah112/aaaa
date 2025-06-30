package src.AST.expression;

public class IncrementExpression extends Expression {
    private Expression expression;
    private boolean isPostfix;

    public IncrementExpression(Expression expression, boolean isPostfix) {
        this.expression = expression;
        this.isPostfix = isPostfix;
    }

    // Getters and setters
    @Override
    public String toString() {
        return "\nIncrementExpression{" +
                "\nexpression=" + expression +
                "\nisPostfix=" + isPostfix +
                "\n}";
    }
}