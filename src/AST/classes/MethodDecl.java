package src.AST.classes;

import src.AST.statement.Statement;

import java.util.List;

public class MethodDecl implements ClassMember {
    private final String name;
    private final String returnType;
    private final List<Statement> body;


    public MethodDecl(String name, String returnType, List<Statement> body) {
        this.name = name;
        this.returnType = returnType;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public String getReturnType() {
        return returnType;
    }
    public List<Statement> getBody() {
        return body;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("(): ").append(returnType).append(" {\n");
        for (Statement stmt : body) {
            sb.append("    ").append(stmt.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}