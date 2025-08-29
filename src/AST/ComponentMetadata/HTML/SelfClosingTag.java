package src.AST.ComponentMetadata.HTML;

import src.AST.Node;
import java.util.ArrayList;
import java.util.List;

public class SelfClosingTag extends Node {
    List<Attributes> attributes = new ArrayList<>();

    public SelfClosingTag(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
    }

    public List<Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "\nSelfClosingTag{" +
                "\nattributes=" + attributes +
                "\n}";
    }
}