package src.AST.expression;

public class ObjectLiteralPair {
    private final String key;
    private final Expression value;

    public ObjectLiteralPair(String key, Expression value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + ": " + value;
    }
}