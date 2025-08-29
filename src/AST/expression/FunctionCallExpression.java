package src.AST.expression;

import java.util.List;

public class FunctionCallExpression extends Expression {
    private Expression function;
    private List<Expression> arguments;

    public FunctionCallExpression(int lineNumber, int columnNumber, Expression function, List<Expression> arguments) {
        super(lineNumber, columnNumber);
        this.function = function;
        this.arguments = arguments;
    }

    // Getters and setters
    @Override
    public String toString() {
        return "\nFunctionCallExpression{" +
                "\nfunction=" + function +
                "\narguments=" + arguments +
                "\n}";
    }

    @Override
    public String generateJS() {
        String args = "";
        if (arguments != null && !arguments.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            boolean first = true;
            for (Expression e : arguments) {
                if (!first) sb.append(", ");
                sb.append(e.generateJS());
                first = false;
            }
            args = sb.toString();
        }
        String fn = function != null ? function.generateJS() : "";
        return fn + "(" + args + ")";
    }
}