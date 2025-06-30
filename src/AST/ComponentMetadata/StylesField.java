package src.AST.ComponentMetadata;

import src.AST.ComponentMetadata.CSS.CssBody;

import java.util.List;

public class StylesField implements ComponentMetadata {
    CssBody cssBody ;

    public StylesField(CssBody cssBody) {
        this.cssBody = cssBody;
    }

    public CssBody getCssBody() {
        return cssBody;
    }

    public void setCssBody(CssBody cssBody) {
        this.cssBody = cssBody;
    }

    @Override
    public String toString() {
        return "\nStyles{" +
                "\n" + cssBody +
                "\n}";
    }
}