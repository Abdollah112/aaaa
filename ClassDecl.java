package src.AST.classes;

import java.util.List;

public class ClassDecl {
    private final boolean isExported;
    private final String name;
    private final String superClass;
    private final List<String> interfaces;
    private final List<ClassMember> members;

    public ClassDecl(boolean isExported, String name, String superClass, List<String> interfaces, List<ClassMember> members) {
        this.isExported = isExported;
        this.name = name;
        this.superClass = superClass;
        this.interfaces = interfaces;
        this.members = members;
    }

    public boolean isExported() {
        return isExported;
    }

    public String getName() {
        return name;
    }

    public String getSuperClass() {
        return superClass;
    }

    public List<String> getInterfaces() {
        return interfaces;
    }

    public List<ClassMember> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (isExported) sb.append("export ");
        sb.append("class ").append(name);

        if (superClass != null) {
            sb.append(" extends ").append(superClass);
        }

        if (interfaces != null && !interfaces.isEmpty()) {
            sb.append(" implements ").append(String.join(", ", interfaces));
        }

        sb.append(" {\n");

        for (ClassMember member : members) {
            sb.append("  ").append(member.toString()).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }
}