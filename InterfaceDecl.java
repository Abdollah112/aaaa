package src.AST;

import java.util.List;

public class InterfaceDecl {
    private final String name;
    private final List<InterfaceField> fields;

    public InterfaceDecl(String name, List<InterfaceField> fields) {
        this.name = name;
        this.fields = fields;
    }

    public String getName() {
        return name;
    }

    public List<InterfaceField> getFields() {
        return fields;
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
