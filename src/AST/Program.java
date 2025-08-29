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
        StringBuilder htmlBuilder = new StringBuilder();
        StringBuilder cssBuilder = new StringBuilder();
        StringBuilder jsBuilder = new StringBuilder();



        for (ImportStmt importStmt : imports) {
            if (importStmt != null) {
                htmlBuilder.append(importStmt.generateHTML());
                cssBuilder.append(importStmt.generateCSS());
                jsBuilder.append(importStmt.generateJS());
            }
        }

        for (InterfaceDecl interfaceDecl : interfaces) {
            if (interfaceDecl != null) {
                htmlBuilder.append(interfaceDecl.generateHTML());
                cssBuilder.append(interfaceDecl.generateCSS());
                jsBuilder.append(interfaceDecl.generateJS());
            }
        }

        for (ComponentDecorator componentDecorator : components) {
            if (componentDecorator != null) {
                htmlBuilder.append(componentDecorator.generateHTML());
                cssBuilder.append(componentDecorator.generateCSS());
                jsBuilder.append(componentDecorator.generateJS());
            }
        }

        for (ClassDecl classDecl : classes) {
            if (classDecl != null) {
                htmlBuilder.append(classDecl.generateHTML());
                cssBuilder.append(classDecl.generateCSS());
                jsBuilder.append(classDecl.generateJS());
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html>\n");
        stringBuilder.append("<head>\n");
        stringBuilder.append("<style>\n");
        stringBuilder.append(cssBuilder);
        stringBuilder.append("</style>\n");
        stringBuilder.append("</head>\n");
        stringBuilder.append("<body>\n");
        stringBuilder.append(htmlBuilder);
        stringBuilder.append("\n<script>\n");


        stringBuilder.append("function render(){\n");
        stringBuilder.append("  // Handle data-binding\n");
        stringBuilder.append("  document.querySelectorAll('[data-bind]').forEach(function(node){\n");
        stringBuilder.append("    var key=node.getAttribute('data-bind');\n");
        stringBuilder.append("    if (typeof window[key] !== 'undefined') { \n");
        stringBuilder.append("      node.textContent = window[key]; \n");
        stringBuilder.append("    }\n");
        stringBuilder.append("  });\n");
        stringBuilder.append("  \n");
        stringBuilder.append("  // Handle *ngIf directives\n");
        stringBuilder.append("  document.querySelectorAll('[data-ng-if]').forEach(function(node){\n");
        stringBuilder.append("    var condition=node.getAttribute('data-ng-if');\n");
        stringBuilder.append("    node.style.display = eval(condition) ? 'block' : 'none';\n");
        stringBuilder.append("  });\n");
        stringBuilder.append("}\n");
        stringBuilder.append(jsBuilder);
        stringBuilder.append("\nrender();\n");
        stringBuilder.append("// Initialize dynamic content\n");
        stringBuilder.append("if (typeof initDynamicContent === 'function') {\n");
        stringBuilder.append("  initDynamicContent();\n");
        stringBuilder.append("}\n");


        stringBuilder.append("function render(){\n");
        stringBuilder.append("  document.querySelectorAll('[data-bind]').forEach(function(node){\n");
        stringBuilder.append("    var key=node.getAttribute('data-bind');\n");
        stringBuilder.append("    if (typeof window[key] !== 'undefined') { node.textContent = window[key]; }\n");
        stringBuilder.append("  });\n");
        stringBuilder.append("}\n");
        stringBuilder.append(jsBuilder);
        stringBuilder.append("\nrender();\n");
        stringBuilder.append("\n</script>\n");
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
