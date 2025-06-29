package src.AST.classes;

import src.AST.expression.Expression;

public class FieldDecl implements ClassMember {
    private final String accessModifier; // "public", "private", etc.
    private final String name;
    private final String type;
    private final boolean isOptional;   // ?
    private final boolean isRequired;   // !
    private final Expression initializer;

    public FieldDecl(
            String accessModifier,
            String name,
            String type,
            boolean isOptional,
            boolean isRequired,
            Expression initializer
    ) {
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
}