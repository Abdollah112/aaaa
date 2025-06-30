package src.AST.ComponentMetadata.CSS;

import java.util.ArrayList;
import java.util.List;

public class CssElement {
    List<CssElementBody> CssElementBodies =new ArrayList<>();

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