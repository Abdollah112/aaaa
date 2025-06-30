package src.AST.ComponentMetadata.HTML;

import java.util.ArrayList;
import java.util.List;

public class TagElement implements Element{
    private OpeningTag openingTag;
    private List<Element> elements = new ArrayList<>();
    private ClosingTag closingTag;
    private SelfClosingTag selfClosingTag;

    public OpeningTag getOpeningTag() {
        return openingTag;
    }

    public void setOpeningTag(OpeningTag openingTag) {
        this.openingTag = openingTag;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public ClosingTag getClosingTag() {
        return closingTag;
    }

    public void setClosingTag(ClosingTag closingTag) {
        this.closingTag = closingTag;
    }

    public SelfClosingTag getSelfClosingTag() {
        return selfClosingTag;
    }

    public void setSelfClosingTag(SelfClosingTag selfClosingTag) {
        this.selfClosingTag = selfClosingTag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nTag{");

        if (selfClosingTag != null) {
            // It's a self-closing tag like <img />
            sb.append("\n").append(selfClosingTag);
        } else if (openingTag != null) {
            // It's a normal tag with content and closing tag
            sb.append("\n").append(openingTag);

            if (elements != null && !elements.isEmpty()) {
                sb.append("\n").append(elements);
            }

            if (closingTag != null) {
                sb.append("\n").append(closingTag);
            }
        }

        sb.append("\n}");
        return sb.toString();
    }
}
