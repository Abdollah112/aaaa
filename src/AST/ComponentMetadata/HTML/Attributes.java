package src.AST.ComponentMetadata.HTML;

import src.AST.Node;

public class Attributes extends Node {
    private String htmlString;
    private String htmlName;
    // For standard HTML attributes like 'src', 'class', etc.
    private String binding;       // For Angular property bindings, like '[src]'
    private String structuralDir; // For Angular structural directives, like '*ngFor', '*ngIf'
    private String event;
    // For Angular event bindings, like '(click)'

    public Attributes(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
    }

    public String getHtmlString() {
        return htmlString;
    }

    public void setHtmlString(String htmlString) {
        this.htmlString = htmlString;
    }

    public String getHtmlName() {
        return htmlName;
    }

    public void setHtmlName(String htmlName) {
        this.htmlName = htmlName;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getStructuralDir() {
        return structuralDir;
    }

    public void setStructuralDir(String structuralDir) {
        this.structuralDir = structuralDir;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    // ... Getters and setters for each attribute type

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nAttributes{");
        if (htmlString != null) {
            sb.append("\nhtmlAttribute='").append(htmlString).append('\'');
        }
        if (htmlName != null) {
            sb.append("\nhtmlAttribute='").append(htmlName).append('\'');
        }
        if (binding != null) {
            sb.append("\nbinding='").append(binding).append('\'');
        }
        if (structuralDir != null) {
            sb.append("\nstructuralDir='").append(structuralDir).append('\'');
        }
        if (event != null) {
            sb.append("\nevent='").append(event).append('\'');
        }
        sb.append("\n}");
        return sb.toString();
    }

    public String generateHTML() {
        StringBuilder result = new StringBuilder();

        // Standard attribute: name="value"
        if (htmlName != null && htmlString != null) {
            result.append(htmlName).append("=\"").append(htmlString).append("\"");
        }

        // Property binding like [src]="..."
        if (binding != null) {
            String bindingExpr = binding.substring(binding.indexOf("=") + 1).replace("\"", "").trim();
            String propName = binding.substring(0, binding.indexOf("=")).replace("[", "").replace("]", "");
            result.append(propName).append("=\"").append(bindingExpr).append("\"");
        }

        // Structural directive like *ngFor="..."
        if (structuralDir != null) {
            // This will be handled separately in the template generation
            // For now, just skip adding it as a regular attribute
        }

        // Event binding like (click)="..." -> onclick="handler();render();"
        if (event != null) {
            String eventExpr = event.substring(event.indexOf("=") + 1).replace("\"", "").trim();
            String eventName = event.substring(0, event.indexOf("=")).replace("(", "").replace(")", "");
            result.append("on").append(eventName).append("=\"").append(eventExpr).append("; render();\"");
        }

        return result.toString();
    }
}