package src.AST.statement;

import src.AST.Node;
import java.util.List;

public class BlockStatement extends Node implements Statement {
    private final List<Statement> statements;

    public BlockStatement(int lineNumber, int columnNumber, List<Statement> statements) {
        super(lineNumber, columnNumber);
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public String generateJS() {
        StringBuilder sb = new StringBuilder();
        if (statements != null) {
            for (Statement stmt : statements) {
                if (stmt instanceof ExpressionStatement) {
                    sb.append(((ExpressionStatement) stmt).generateJS());
                } else if (stmt instanceof BlockStatement) {
                    sb.append(((BlockStatement) stmt).generateJS());
                }
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{\n");
        for (Statement stmt : statements) {
            sb.append("  ").append(stmt).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}