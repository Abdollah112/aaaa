package src.AST.expression;

import src.AST.Node;
import java.util.List;

public class PrimaryExpression extends Expression {
    public String op;
    public ArrayLiteralExpression arrayLiteralExpression;
    public ObjectLiteralExpression objectLiteralExpression;
    public Expression expression;

    public PrimaryExpression(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
    }
    // Optional: for compatibility, a no-arg constructor that defaults to (0,0)
    public PrimaryExpression() {
        super(0, 0);
    }
    public void setOp(String op) {
        this.op = op;
    }
    public void setArrayLiteralExpression(ArrayLiteralExpression arrayLiteralExpression) {
        this.arrayLiteralExpression = arrayLiteralExpression;
    }
    public void setObjectLiteralExpression(ObjectLiteralExpression objectLiteralExpression) {
        this.objectLiteralExpression = objectLiteralExpression;
    }
    public void setExpression(Expression expression) {
        this.expression = expression;
    }
    public Expression getExpression() {
        return expression;
    }
    @Override
    public String toString() {
        if (arrayLiteralExpression != null) {
            return arrayLiteralExpression.toString();
        }
        if (objectLiteralExpression != null) {
            return objectLiteralExpression.toString();
        }
        if (expression != null && op != null) {
            return expression + op;
        }
        if (expression != null) {
            return expression.toString();
        }
        return "unknown";
    }
}



