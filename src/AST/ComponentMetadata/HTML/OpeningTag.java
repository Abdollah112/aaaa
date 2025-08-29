package src.AST.ComponentMetadata.HTML;

import src.AST.Node;
import java.util.ArrayList;
import java.util.List;

public class OpeningTag extends Node {
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