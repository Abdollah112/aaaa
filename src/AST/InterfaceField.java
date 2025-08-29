package src.AST;

public class InterfaceField extends Node {
    private final String name;
    private final String type;

    public InterfaceField(int lineNumber, int columnNumber, String name, String type) {
        super(lineNumber, columnNumber);
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + ": " + type + ";";
    }

    public String generateHTML() { return ""; }
    public String generateCSS() { return ""; }
    public String generateJS() { return ""; }
}
