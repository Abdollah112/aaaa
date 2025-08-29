package src.AST.ComponentMetadata.CSS;

import src.AST.Node;
import java.util.ArrayList;
import java.util.List;

public class CssElement extends Node {
    private String selector;
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

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public String generateCSS() {
        StringBuilder sb = new StringBuilder();
        if (selector != null && !selector.isEmpty()) {
            String cleanSelector = selector.trim();
            sb.append(cleanSelector).append(" {\n");
            if (CssElementBodies != null) {
                for (CssElementBody body : CssElementBodies) {
                    sb.append("  ").append(body.generateCSS()).append("\n");
                }
            }
            sb.append("}\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "\nCssElement{" +
                "\nCssElementBodies=" + CssElementBodies +
                "\n}";
    }
}