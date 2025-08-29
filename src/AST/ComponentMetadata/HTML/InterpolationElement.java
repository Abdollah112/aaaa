package src.AST.ComponentMetadata.HTML;

import src.AST.Node;

public class InterpolationElement extends Node implements Element {
    private String value;

    public InterpolationElement(int lineNumber, int columnNumber, String value) {
        super(lineNumber, columnNumber);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nInterpolationElement{" +
                "\nvalue='" + value + '\'' +
                "\n}";
    }

    public String generateHTML() {
        if (value == null) return "";
        return "<span data-bind=\"" + value + "\">{{" + value + "}}</span>";
    }
}
