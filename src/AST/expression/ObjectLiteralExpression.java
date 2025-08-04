package src.AST.expression;

import java.util.List;

public class ObjectLiteralExpression extends Expression {
    private final List<ObjectLiteralPair> objectLiteralPairs;

    public ObjectLiteralExpression(int lineNumber, int columnNumber, List<ObjectLiteralPair> objectLiteralPairs) {
        super(lineNumber, columnNumber);
        this.objectLiteralPairs = objectLiteralPairs;
    }

    public List<ObjectLiteralPair> getExpressions() {
        return objectLiteralPairs;
    }

    @Override
    public String toString() {
        if (objectLiteralPairs == null || objectLiteralPairs.isEmpty()) {
            return "";
        }
        return objectLiteralPairs.stream()
                .map(ObjectLiteralPair::toString)
                .reduce((a, b) -> a + ", " + b)
                .orElse("");
    }
}
