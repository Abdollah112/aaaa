package src.AST;

import src.AST.classes.ClassDecl;

import java.util.ArrayList;
import java.util.List;

public class Program extends Node {
    public List<ImportStmt> imports;
    public List<InterfaceDecl> interfaces;
    public List<ComponentDecorator> components;
    public List<ClassDecl> classes;

    public Program(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
        this.imports = new ArrayList<>();
        this.interfaces = new ArrayList<>();
        this.components = new ArrayList<>();
        this.classes = new ArrayList<>();
    }

    public void addImport(ImportStmt importStmt) {
        imports.add(importStmt);
    }

    public void addInterface(InterfaceDecl interfaceDecl) {
        interfaces.add(interfaceDecl);
    }

    public void addComponent(ComponentDecorator componentDecorator) {
        components.add(componentDecorator);
    }

    public void addClass(ClassDecl classNode) {
        classes.add(classNode);
    }

    public List<InterfaceDecl> getInterfaces() {
        return interfaces;
    }

    public List<ComponentDecorator> getComponents() {
        return components;
    }

    public List<ClassDecl> getClasses() {
        return classes;
    }

    public List<ImportStmt> getImports() {
        return imports;
    }



    public String generateCode() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html>\n");
        stringBuilder.append("<head>\n");
        stringBuilder.append("<style>\n");

        // the css part

        stringBuilder.append("</style>\n");
        stringBuilder.append("</head>\n");

        stringBuilder.append("<body>\n");

        // html part

        stringBuilder.append("\n<script>");


        // js part

        stringBuilder.append("</script>\n");
        stringBuilder.append("</body>\n");
        stringBuilder.append("</html>\n");
        return stringBuilder.toString();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.format("Program { Line: %d, Column: %d\n", lineNumber, columnNumber));

        if (!imports.isEmpty()) {
            sb.append("  Imports:\n");
            for (ImportStmt imp : imports) {
                sb.append("    ").append(imp).append("\n");
            }
        }

        if (!interfaces.isEmpty()) {
            sb.append("  Interfaces:\n");
            for (InterfaceDecl intf : interfaces) {
                sb.append("    ").append(intf).append("\n");
            }
        }

        if (!components.isEmpty()) {
            sb.append("  Components:\n");
            for (ComponentDecorator comp : components) {
                sb.append("    ").append(comp).append("\n");
            }
        }

        if (!classes.isEmpty()) {
            sb.append("  Classes:\n");
            for (ClassDecl cls : classes) {
                sb.append("    ").append(cls).append("\n");
            }
        }

        sb.append("}");
        return sb.toString();
    }


}
