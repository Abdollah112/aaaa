package src.AST;

import src.AST.ComponentMetadata.ComponentMetadata;

import java.util.List;

public class ComponentDecorator extends Node {
    private final String name;
    private List<ComponentMetadata> componentMetadata;

    public ComponentDecorator(int lineNumber, int columnNumber, String name, List<ComponentMetadata> componentMetadata) {
        super(lineNumber, columnNumber);
        this.name = name;
        this.componentMetadata = componentMetadata;
    }

    public String getName() {
        return name;
    }

    public List<ComponentMetadata> getComponentMetadata() {
        return componentMetadata;
    }

    // === Setters ===
    public void setComponentMetadata(List<ComponentMetadata> componentMetadata) {
        this.componentMetadata = componentMetadata;
    }

    public String generateHTML() {
        StringBuilder sb = new StringBuilder();
        if (componentMetadata != null) {
            for (ComponentMetadata metadata : componentMetadata) {
                if (metadata instanceof src.AST.ComponentMetadata.TemplateField) {
                    sb.append(((src.AST.ComponentMetadata.TemplateField) metadata).generateHTML());
                }
            }
        }
        return sb.toString();
    }

    public String generateCSS() {
        StringBuilder sb = new StringBuilder();
        if (componentMetadata != null) {
            for (ComponentMetadata metadata : componentMetadata) {
                if (metadata instanceof src.AST.ComponentMetadata.StylesField) {
                    sb.append(((src.AST.ComponentMetadata.StylesField) metadata).generateCSS());
                }
            }
        }
        return sb.toString();
    }

    public String generateJS() {
        // Components may contribute JS later (e.g., lifecycle hooks). Empty for now.
        return "";
    }

    // === toString ===
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("@").append(name).append("({\n");

        if (componentMetadata != null && !componentMetadata.isEmpty()) {
            for (ComponentMetadata metadata : componentMetadata) {
                sb.append("  ").append(metadata.toString().replaceAll("\n", "\n  ")).append(",\n");
            }
            sb.delete(sb.length() - 2, sb.length()); // remove last ",\n"
        }

        sb.append("\n})");
        return sb.toString();
    }

}
