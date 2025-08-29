package src.AST.expression;

public class IncrementExpression extends Expression {
    private Expression expression;
    private boolean isPostfix;

    public IncrementExpression(int lineNumber, int columnNumber, Expression expression, boolean isPostfix) {
        super(lineNumber, columnNumber);
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

    @Override
    public String generateJS() {
        if (expression == null) return "";
        return isPostfix ? expression.generateJS() + "++" : "++" + expression.generateJS();
    }
}