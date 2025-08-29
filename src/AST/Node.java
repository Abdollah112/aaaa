package src.AST;

public class Node {
    protected int lineNumber;
    protected int columnNumber;

    public Node(int lineNumber, int columnNumber) {
        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    @Override
    public String toString() {
        return String.format("Line: %d, Column: %d", lineNumber, columnNumber);
    }
} 