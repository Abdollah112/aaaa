package src.AST.ComponentMetadata.HTML;

import src.AST.Node;
import java.util.ArrayList;
import java.util.List;

public class SelfClosingTag extends Node {
    private String tagName;
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

    public String getTagName() { return tagName; }
    public void setTagName(String tagName) { this.tagName = tagName; }

    public String generateHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        if (tagName != null) {
            sb.append(tagName);
        }
        if (attributes != null) {
            boolean first = true;
            for (Attributes attr : attributes) {
                String rendered = attr.generateHTML();
                if (!rendered.isEmpty()) {
                    sb.append(first ? " " : " ");
                    sb.append(rendered);
                    first = false;
                }
            }
        }
        sb.append(" />");
        return sb.toString();
    }

    @Override
    public String toString() {
        return "\nSelfClosingTag{" +
                "\nattributes=" + attributes +
                "\n}";
    }
}