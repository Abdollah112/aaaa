package src.AST.expression;

import src.AST.classes.ClassMember;

import java.util.List;

public class Expression {
    public PrimaryExpression primaryExpression;
    public Expression left;
    public Expression right;
    public String operator;
    public String id;
    public ArgumentList argumentList;


    public Expression() {
    }
    public void setPrimaryExpression(PrimaryExpression primaryExpression) {
        this.primaryExpression = primaryExpression;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public void setOp(String operator) {
        this.operator = operator;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setArgumentList(ArgumentList argumentList) {
        this.argumentList = argumentList;
    }

    // === Optional Getters (if needed later) ===

    public PrimaryExpression getPrimaryExpression() {
        return primaryExpression;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public String getOperator() {
        return operator;
    }

    public String getId() {
        return id;
    }

    public ArgumentList getArgumentList() {
        return argumentList;
    }

    // === toString() (for debugging / printing) ===

    @Override
    public String toString() {
        if (primaryExpression != null) {
            return primaryExpression.toString();
        } else if (left != null && operator != null && right != null) {
            return "(" + left + " " + operator + " " + right + ")";
        } else if (left != null && operator != null && id != null) {
            return "(" + left+ operator + id + ")";
        } else if (id != null && argumentList != null) {
            return id + "(" + argumentList + ")";
        } else if (id != null) {
            return id;
        } else {
            return "unknown";
        }
    }

}