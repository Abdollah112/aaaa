package src.AST;

public class PrimaryType extends Node {
    public PrimaryType(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
    }

    @Override
    public String toString() {
        return String.format("PrimaryType{pos: Line: %d, Column: %d}", lineNumber, columnNumber);
    }
}
