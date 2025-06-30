package src.AST.expression;

public class AdditiveExpression extends Expression {

    public AdditiveExpression(Expression left, Expression right, String operator) {
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
