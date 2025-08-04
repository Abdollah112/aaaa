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
