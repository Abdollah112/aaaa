package src.AST.expression;

import java.util.List;

public class ArrayLiteralExpression extends Expression {
    private final List<Expression> expressions;

    public ArrayLiteralExpression(int lineNumber, int columnNumber, List<Expression> expressions) {
        super(lineNumber, columnNumber);
        this.expressions = expressions;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    @Override
    public String toString() {
        if (expressions == null || expressions.isEmpty()) {
            return "";
        }
        return expressions.stream()
                .map(Expression::toString)
                .reduce((a, b) -> a + ", " + b)
                .orElse("");
    }

    @Override
    public String generateJS() {
        if (expressions == null || expressions.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (Expression e : expressions) {
            if (!first) sb.append(", ");
            sb.append(e.generateJS());
            first = false;
        }
        return sb.toString();
    }
}   
