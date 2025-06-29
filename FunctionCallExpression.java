package src.AST.expression;

import java.util.List;

public class FunctionCallExpression extends Expression {
    private Expression function;
    private List<Expression> arguments;

    public FunctionCallExpression(Expression function, List<Expression> arguments) {
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
}