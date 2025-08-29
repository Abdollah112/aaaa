package src.AST;

import java.util.List;

public class InterfaceDecl extends Node {
    private final String name;
    private final List<InterfaceField> fields;

    public InterfaceDecl(int lineNumber, int columnNumber, String name, List<InterfaceField> fields) {
        super(lineNumber, columnNumber);
        this.name = name;
        this.fields = fields;
    }

    public String getName() {
        return name;
    }

    public List<InterfaceField> getFields() {
        return fields;
    }

    public String generateHTML() { return ""; }
    public String generateCSS() { return ""; }
    public String generateJS() {
        StringBuilder sb = new StringBuilder();
        sb.append("/**\n");
        sb.append(" * @typedef {Object} ").append(name).append("\n");
        if (fields != null) {
            for (InterfaceField field : fields) {
                String type = field.getType();
                String fieldName = field.getName();
                if (type == null) type = "any";
                sb.append(" * @property {").append(type).append("} ")
                  .append(fieldName).append("\n");
            }
        }
        sb.append(" */\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("interface ").append(name).append(" {\n");
        for (InterfaceField field : fields) {
            sb.append("  ").append(field.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
