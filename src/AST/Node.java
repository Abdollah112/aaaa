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

    // Code generation hooks; children can override as needed
    public String generateHTML() {
        return "";
    }

    public String generateCSS() {
        return "";
    }

    public String generateJS() {
        return "";
    }
} 