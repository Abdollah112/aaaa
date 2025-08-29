package src.AST.ComponentMetadata.HTML;

import src.AST.Node;
import java.util.ArrayList;
import java.util.List;

public class OpeningTag extends Node {
    private String tagName;
    List<Attributes> attributes = new ArrayList<>();

    public OpeningTag(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
    }

    public List<Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String generateHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        if (tagName != null) {
            sb.append(tagName);
        }
        if (attributes != null) {
            for (Attributes attr : attributes) {
                String rendered = attr.generateHTML();
                if (!rendered.isEmpty()) {
                    sb.append(" ").append(rendered);
                }
            }
        }
        sb.append(">");
        return sb.toString();
    }

    @Override
    public String toString() {
        if(attributes!=null){
            return "\nOpeningTag{" +
                    attributes +
                    "\n}";
        }
        return "";
    }
}