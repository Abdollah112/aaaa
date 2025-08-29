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
        String positionInfo = super.toString();
        
        if (arrayLiteralExpression != null) {
            return String.format("%s %s", arrayLiteralExpression.toString(), positionInfo);
        }
        if (objectLiteralExpression != null) {
            return String.format("%s %s", objectLiteralExpression.toString(), positionInfo);
        }
        if (expression != null && op != null) {
            return String.format("%s%s %s", expression, op, positionInfo);
        }
        if (expression != null) {
            return String.format("%s %s", expression.toString(), positionInfo);
        }
        return String.format("unknown %s", positionInfo);
    }
}



