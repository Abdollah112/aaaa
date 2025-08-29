package src.AST.ComponentMetadata.HTML;

import src.AST.Node;

public class HtmlNameElement extends Node implements Element {
    String name;

    public HtmlNameElement(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nHtmlNameElement{" +
                "\nname='" + name + '\'' +
                "\n}";
    }
}
