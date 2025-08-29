package src.AST.expression;

public class AssignmentExpression extends Expression {
    private Expression left;
    private Expression right;

    public AssignmentExpression(int lineNumber, int columnNumber, Expression left, Expression right) {
        super(lineNumber, columnNumber);
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

    @Override
    public String generateJS() {
        return (left != null ? left.generateJS() : "") + " = " + (right != null ? right.generateJS() : "");
    }
}