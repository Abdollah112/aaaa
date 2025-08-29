package src.AST;

public class ID extends Node {
    public ID(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
    }

    @Override
    public String toString() {
        return String.format("ID{pos: Line: %d, Column: %d}", lineNumber, columnNumber);
    }
}
