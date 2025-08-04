package src.AST.ComponentMetadata;

import src.AST.Node;
import src.AST.ComponentMetadata.HTML.Element;
import java.util.ArrayList;
import java.util.List;

public class TemplateField extends Node implements ComponentMetadata {
    List<Element> element = new ArrayList<>();

    public TemplateField(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
    }

    public List<Element> getElement() {
        return element;
    }

    public void setElement(List<Element> element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "\nTemplate{" +
                "\n" + element +
                "\n}";
    }
}