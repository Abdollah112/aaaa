package src.AST.ComponentMetadata.CSS;

import src.AST.Node;

public class CssBody extends Node {
    CssObjects cssObjects;

    public CssBody(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
    }

    public CssObjects getCssObjects() {
        return cssObjects;
    }

    public void setCssObjects(CssObjects cssObjects) {
        this.cssObjects = cssObjects;
    }

    @Override
    public String toString() {
        return "\nCssBody{" +
                "\n=" + cssObjects +
                "\n}";
    }
}
