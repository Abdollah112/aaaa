package src.AST.expression;

import src.AST.Node;

public class PropertyAccessExpression extends Expression {
    private Expression object;
    private String property;

    public PropertyAccessExpression(int lineNumber, int columnNumber, Expression object, String property) {
        super(lineNumber, columnNumber);
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