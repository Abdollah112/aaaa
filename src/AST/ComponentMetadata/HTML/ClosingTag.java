package src.AST.ComponentMetadata.HTML;

import src.AST.Node;

public class ClosingTag extends Node {
    String NAME_HTML;

    public ClosingTag(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
    }

    public String getNAME_HTML() {
        return NAME_HTML;
    }

    public void setNAME_HTML(String NAME_HTML) {
        this.NAME_HTML = NAME_HTML;
    }

    @Override
    public String toString() {
        return "\nClosingTag{" +
                "\nNAME_HTML='" + NAME_HTML + '\'' +
                "\n}";
    }
}