package src.AST.ComponentMetadata;

import src.AST.ComponentMetadata.HTML.*;
import src.AST.Node;

import java.util.ArrayList;
import java.util.List;

public class TemplateField extends Node implements ComponentMetadata {
    List<Element> element = new ArrayList<>();

    public TemplateField(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
    }

    public List<Element> getElement() {
        return element;
    }

    public void setElement(List<Element> element) {
        this.element = element;
    }

    @Override
    public String generateHTML() {
        StringBuilder sb = new StringBuilder();
        if (element != null) {
            Element previousElement = null;
            for (Element el : element) {
                // Insert a space between consecutive text nodes at the root template level
                if (previousElement instanceof HtmlNameElement && el instanceof HtmlNameElement) {
                    sb.append(" ");
                }

                if (el instanceof TagElement) {
                    TagElement tag = (TagElement) el;
                    // Check if this tag has *ngFor directive
                    boolean hasNgFor = hasNgForDirective(tag);

                    if (hasNgFor) {
                        sb.append(generateNgForContent(tag));
                    } else {
                        sb.append(tag.generateHTML());
                    }
                } else if (el instanceof HtmlNameElement) {
                    sb.append(((HtmlNameElement) el).generateHTML());
                } else if (el instanceof InterpolationElement) {
                    sb.append(((InterpolationElement) el).generateHTML());
                }

                previousElement = el;
            }
        }
        return sb.toString();
    }

    private boolean hasNgForDirective(TagElement tag) {
        if (tag.getOpeningTag() != null && tag.getOpeningTag().getAttributes() != null) {
            for (Attributes attr : tag.getOpeningTag().getAttributes()) {
                if (attr.getStructuralDir() != null && attr.getStructuralDir().contains("*ngFor")) {
                    return true;
                }
            }
        }
        return false;
    }

    private String generateNgForContent(TagElement tag) {
        StringBuilder sb = new StringBuilder();
        String ngForExpression = "";

        // Extract the ngFor expression
        for (Attributes attr : tag.getOpeningTag().getAttributes()) {
            if (attr.getStructuralDir() != null && attr.getStructuralDir().contains("*ngFor")) {
                ngForExpression = attr.getStructuralDir().split("=")[1].replace("\"", "").trim();
                break;
            }
        }

        // Parse the ngFor expression (e.g., "let product of products")
        String[] parts = ngForExpression.split(" ");
        String itemVar = parts[1]; // "product"
        String collectionVar = parts[3]; // "products"

        // Generate JavaScript to create the list dynamically
        sb.append("<script>\n");
        sb.append("  (function() {\n");
        sb.append("    var container = document.createElement('div');\n");
        sb.append("    var collection = ").append(collectionVar).append(";\n");
        sb.append("    var template = `").append(generateStaticTagHTML(tag)).append("`;\n");
        sb.append("    \n");
        sb.append("    collection.forEach(function(").append(itemVar).append(") {\n");
        sb.append("      var itemHtml = template;\n");
        sb.append("      // Replace interpolations\n");
        sb.append("      itemHtml = itemHtml.replace(/{{" + itemVar + "\\.(\\w+)}}/g, function(match, p1) {\n");
        sb.append("        return ").append(itemVar).append("[p1] || '';\n");
        sb.append("      });\n");
        sb.append("      container.innerHTML += itemHtml;\n");
        sb.append("    });\n");
        sb.append("    \n");
        sb.append("    document.currentScript.parentNode.insertBefore(container, document.currentScript);\n");
        sb.append("  })();\n");
        sb.append("</script>\n");

        return sb.toString();
    }

    private String generateStaticTagHTML(TagElement tag) {
        // Generate HTML without the *ngFor directive
        StringBuilder sb = new StringBuilder();

        if (tag.getOpeningTag() != null) {
            sb.append("<").append(tag.getOpeningTag().getTagName());

            // Add all attributes except *ngFor
            for (Attributes attr : tag.getOpeningTag().getAttributes()) {
                if (attr.getStructuralDir() == null || !attr.getStructuralDir().contains("*ngFor")) {
                    String attrHtml = attr.generateHTML();
                    if (!attrHtml.isEmpty()) {
                        sb.append(" ").append(attrHtml);
                    }
                }
            }

            sb.append(">");
        }

        // Add inner elements
        if (tag.getElements() != null) {
            Element previousElement = null;
            for (Element el : tag.getElements()) {
                // Insert a space between consecutive text nodes inside the static tag template
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

        if (tag.getClosingTag() != null) {
            sb.append("</").append(tag.getClosingTag().getNAME_HTML()).append(">");
        }

        return sb.toString();
    }

    @Override
    public String generateCSS() { return ""; }

    @Override
    public String generateJS() { return ""; }

    @Override
    public String toString() {
        return "\nTemplate{" +
                "\n" + element +
                "\n}";
    }
}