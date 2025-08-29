package src.AST.expression;

import src.AST.Node;

public class ObjectLiteralPair extends Node {
    private final String key;
    private final Expression value;

    public ObjectLiteralPair(int lineNumber, int columnNumber, String key, Expression value) {
        super(lineNumber, columnNumber);
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + ": " + value;
    }

    public String generateJS() {
        return key + ": " + (value != null ? value.generateJS() : "null");
    }
}