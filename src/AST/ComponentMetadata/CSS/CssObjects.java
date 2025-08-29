package src.AST.ComponentMetadata.CSS;

import src.AST.Node;
import java.util.ArrayList;
import java.util.List;

public class CssObjects extends Node {
    List<CssElement> cssElementlist = new ArrayList<CssElement>();

    public CssObjects(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
    }

    public List<CssElement> getCssElementlist() {
        return cssElementlist;
    }

    public void setCssElementlist(List<CssElement> cssElementlist) {
        this.cssElementlist = cssElementlist;
    }

    public String generateCSS() {
        StringBuilder sb = new StringBuilder();
        if (cssElementlist != null) {
            for (CssElement el : cssElementlist) {
                sb.append(el.generateCSS());
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "\nCssObjects{" +
                "\n" + cssElementlist +
                "\n}";
    }
}