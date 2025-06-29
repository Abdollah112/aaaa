package src.AST.ComponentMetadata;
import src.AST.ComponentMetadata.HTML.Element;

import java.util.ArrayList;
import java.util.List;

public class TemplateField implements ComponentMetadata {
    List<Element> element = new ArrayList();

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