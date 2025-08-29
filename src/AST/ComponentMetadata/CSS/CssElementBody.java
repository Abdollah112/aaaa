package src.AST.ComponentMetadata.CSS;

import src.AST.Node;

public class CssElementBody extends Node {
    String propertyName;
    CssValue cssValue;

    public CssElementBody(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
    }

    public String getPropertyName() { return propertyName; }
    public void setPropertyName(String propertyName) { this.propertyName = propertyName; }

    public CssValue getCssValue() {
        return cssValue;
    }

    public void setCssValue(CssValue cssValue) {
        this.cssValue = cssValue;
    }

    public String generateCSS() {
        StringBuilder sb = new StringBuilder();
        if (propertyName != null) {
            sb.append(propertyName).append(": ");
            if (cssValue != null) sb.append(cssValue.generateCSS());
            sb.append(";");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "\nBodyelement{" +
                "\nproperty='" + propertyName + '\'' +
                ", \nvalue=" + cssValue +
                "\n}";
    }
}
