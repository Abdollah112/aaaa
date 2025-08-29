package src.AST.classes;

import src.AST.Node;
import src.AST.expression.Expression;

public class FieldDecl extends Node implements ClassMember {
    private final String accessModifier; // "public", "private", etc.
    private final String name;
    private final String type;
    private final boolean isOptional;   // ?
    private final boolean isRequired;   // !
    private final Expression initializer;

    public FieldDecl(int lineNumber, int columnNumber,
            String accessModifier,
            String name,
            String type,
            boolean isOptional,
            boolean isRequired,
            Expression initializer
    ) {
        super(lineNumber, columnNumber);
        this.accessModifier = accessModifier;
        this.name = name;
        this.type = type;
        this.isOptional = isOptional;
        this.isRequired = isRequired;
        this.initializer = initializer;
    }

    // Getters
    public String getAccessModifier() { return accessModifier; }
    public String getName() { return name; }
    public String getType() { return type; }
    public boolean isOptional() { return isOptional; }
    public boolean isRequired() { return isRequired; }
    public Expression getInitializer() { return initializer; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (accessModifier != null) {
            sb.append(accessModifier).append(" ");
        }

        sb.append(name);

        if (isOptional) {
            sb.append("?");
        } else if (isRequired) {
            sb.append("!");
        }

        sb.append(": ").append(type);

        if (initializer != null) {
            sb.append(" = ").append(initializer);
        }

        sb.append(";");

        return sb.toString();
    }

    public String generateJS() {
        StringBuilder sb = new StringBuilder();
        sb.append("window.").append(name);
        if (initializer != null) {
            sb.append(" = ").append(initializer.generateJS());
        }
        sb.append(";");
        return sb.toString();
    }
}