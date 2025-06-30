package src.AST.expression;

public class AssignmentExpression extends Expression {
    private Expression left;
    private Expression right;

    public AssignmentExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // Getters and setters
    @Override
    public String toString() {
        return "\nAssignmentExpression{" +
                "\nleft=" + left +
                "\nright=" + right +
                "\n}";
    }
}