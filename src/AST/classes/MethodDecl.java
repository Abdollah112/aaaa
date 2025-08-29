package src.AST.classes;

import src.AST.Node;
import src.AST.statement.Statement;

import java.util.List;

public class MethodDecl extends Node implements ClassMember {
    private final String name;
    private final String returnType;
    private final List<Statement> body;


    public MethodDecl(int lineNumber, int columnNumber, String name, String returnType, List<Statement> body) {
        super(lineNumber, columnNumber);
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

    public String generateJS() {
        StringBuilder sb = new StringBuilder();
        sb.append("function ").append(name).append("() {\n");
        if (body != null) {
            for (Statement stmt : body) {
                if (stmt instanceof src.AST.statement.ExpressionStatement) {
                    sb.append("  ").append(((src.AST.statement.ExpressionStatement) stmt).generateJS()).append("\n");
                } else if (stmt instanceof src.AST.statement.BlockStatement) {
                    // Inline nested blocks
                    String block = ((src.AST.statement.BlockStatement) stmt).generateJS();
                    for (String line : block.split("\n")) {
                        if (!line.isEmpty()) sb.append("  ").append(line).append("\n");
                    }
                }
            }
        }
        sb.append("  render();\n");
        sb.append("}\n");
        return sb.toString();
    }
}