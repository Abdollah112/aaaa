package src.AST.expression;

public class MultiplicativeExpression extends Expression {
    private Expression left;
    private Expression right;
    private String operator;

    public MultiplicativeExpression(Expression left, Expression right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    // Getters and setters
    @Override
    public String toString() {
        return "\nMultiplicativeExpression{" +
                "\nleft=" + left +
                "\noperator='" + operator + '\'' +
                "\nright=" + right +
                "\n}";
    }
}