package src.AST.classes;

import src.AST.Node;
import java.util.List;

public class ClassDecl extends Node {
    private final boolean isExported;
    private final String name;
    private final String superClass;
    private final List<String> interfaces;
    private final List<ClassMember> members;

    public ClassDecl(int lineNumber, int columnNumber, boolean isExported, String name, String superClass, List<String> interfaces, List<ClassMember> members) {
        super(lineNumber, columnNumber);
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

    public String generateHTML() { return ""; }

    public String generateCSS() { return ""; }

    public String generateJS() {
        StringBuilder sb = new StringBuilder();
        // Emit fields as let declarations, methods as functions
        if (members != null) {
            for (ClassMember member : members) {
                if (member instanceof FieldDecl) {
                    FieldDecl f = (FieldDecl) member;
                    sb.append(f.generateJS()).append("\n");
                } else if (member instanceof MethodDecl) {
                    MethodDecl m = (MethodDecl) member;
                    sb.append(m.generateJS());
                }
            }
        }
        return sb.toString();
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