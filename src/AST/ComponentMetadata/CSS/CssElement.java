package src.AST.ComponentMetadata.CSS;

import src.AST.Node;
import java.util.ArrayList;
import java.util.List;

public class CssElement extends Node {
    List<CssElementBody> CssElementBodies = new ArrayList<>();

    public CssElement(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
    }

    public List<CssElementBody> getBodyCssElements() {
        return CssElementBodies;
    }

    public void setBodyCssElements(List<CssElementBody> CssElementBodies) {
        this.CssElementBodies = CssElementBodies;
    }

    @Override
    public String toString() {
        return "\nCssElement{" +
                "\nCssElementBodies=" + CssElementBodies +
                "\n}";
    }
}