package src.AST.expression;

import java.util.List;

public class ArrayLiteralExpression extends Expression {
    private final List<Expression> expressions;

    public ArrayLiteralExpression(List<Expression> expressions) {
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
}
