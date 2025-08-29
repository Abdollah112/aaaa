package src.AST.ComponentMetadata;

import src.AST.Node;
import src.AST.ComponentMetadata.CSS.CssBody;
import java.util.List;

public class StylesField extends Node implements ComponentMetadata {
    CssBody cssBody;

    public StylesField(int lineNumber, int columnNumber, CssBody cssBody) {
        super(lineNumber, columnNumber);
        this.cssBody = cssBody;
    }

    public CssBody getCssBody() {
        return cssBody;
    }

    public void setCssBody(CssBody cssBody) {
        this.cssBody = cssBody;
    }

    @Override
    public String generateHTML() { return ""; }

    @Override
    public String generateCSS() {
        if (cssBody == null) return "";
        return cssBody.generateCSS();
    }

    @Override
    public String generateJS() { return ""; }

    @Override
    public String toString() {
        return "\nStyles{" +
                "\n" + cssBody +
                "\n}";
    }
}