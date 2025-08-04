package src.AST.ComponentMetadata.CSS;

import src.AST.Node;

public class CssElementBody extends Node {
    String Id_css;
    CssValue cssValue;

    public CssElementBody(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
    }

    public String getId_css() {
        return Id_css;
    }

    public void setId_css(String id_css) {
        Id_css = id_css;
    }

    public CssValue getCssValue() {
        return cssValue;
    }

    public void setCssValue(CssValue cssValue) {
        this.cssValue = cssValue;
    }

    @Override
    public String toString() {
        return "\nBodyelement{" +
                "\nId_css='" + Id_css + '\'' +
                ", \n=" + cssValue +
                "\n}";
    }
}
