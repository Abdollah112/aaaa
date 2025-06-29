package src.AST.expression;

public class PropertyAccessExpression extends Expression {
    private Expression object;
    private String property;

    public PropertyAccessExpression(Expression object, String property) {
        this.object = object;
        this.property = property;
    }

    // Getters and setters
    @Override
    public String toString() {
        return "\nPropertyAccessExpression{" +
                "\nobject=" + object +
                "\nproperty='" + property + '\'' +
                "\n}";
    }
}