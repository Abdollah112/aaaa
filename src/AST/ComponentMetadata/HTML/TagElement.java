package src.AST.ComponentMetadata.HTML;

import src.AST.Node;
import java.util.ArrayList;
import java.util.List;

public class TagElement extends Node implements Element {
    private OpeningTag openingTag;
    private List<Element> elements = new ArrayList<>();
    private ClosingTag closingTag;
    private SelfClosingTag selfClosingTag;

    public TagElement(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
    }

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

    public String generateHTML() {
        StringBuilder sb = new StringBuilder();
        if (selfClosingTag != null) {
            sb.append(selfClosingTag.generateHTML());
        } else if (openingTag != null) {
            sb.append(openingTag.generateHTML());
            if (elements != null) {
                Element previousElement = null;
                for (Element el : elements) {
                    // Insert a space between consecutive text nodes to preserve word boundaries
                    if (previousElement instanceof HtmlNameElement && el instanceof HtmlNameElement) {
                        sb.append(" ");
                    }

                    if (el instanceof TagElement) {
                        sb.append(((TagElement) el).generateHTML());
                    } else if (el instanceof HtmlNameElement) {
                        sb.append(((HtmlNameElement) el).generateHTML());
                    } else if (el instanceof InterpolationElement) {
                        sb.append(((InterpolationElement) el).generateHTML());
                    }

                    previousElement = el;
                }
            }
            if (closingTag != null) {
                sb.append(closingTag.generateHTML());
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nTag{");

        if (selfClosingTag != null) {
            sb.append("\n").append(selfClosingTag);
        } else if (openingTag != null) {
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
