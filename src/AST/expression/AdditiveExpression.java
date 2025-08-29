package src.AST.expression;

public class AdditiveExpression extends Expression {
    public AdditiveExpression(int lineNumber, int columnNumber, Expression left, Expression right, String operator) {
        super(lineNumber, columnNumber);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    // Getters and setters
    @Override
    public String toString() {
        return "\nAdditiveExpression{" +
                "\nleft=" + left +
                "\noperator='" + operator + '\'' +
                "\nright=" + right +
                "\n}";
    }
}
