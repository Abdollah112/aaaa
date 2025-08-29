package src.AST.expression;

import src.AST.Node;
import src.AST.classes.ClassMember;

import java.util.List;

public class Expression extends Node {
    public PrimaryExpression primaryExpression;
    public Expression left;
    public Expression right;
    public String operator;
    public String id;
    public ArgumentList argumentList;

    public Expression(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
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

    @Override
    public String toString() {
        if (primaryExpression != null) {
            return primaryExpression.toString() + " " + super.toString();
        } else if (left != null && operator != null && right != null) {
            return String.format("(%s %s %s) %s", left, operator, right, super.toString());
        } else if (left != null && operator != null && id != null) {
            return String.format("(%s%s%s) %s", left, operator, id, super.toString());
        } else if (id != null && argumentList != null) {
            return String.format("%s(%s) %s", id, argumentList, super.toString());
        } else if (id != null) {
            return String.format("%s %s", id, super.toString());
        } else {
            return String.format("unknown %s", super.toString());
        }
    }

    // Default JS generation; subclasses can override
    public String generateJS() {
        if (primaryExpression != null) {
            return primaryExpression.generateJS();
        } else if (left != null && operator != null && right != null) {
            return left.generateJS() + " " + operator + " " + right.generateJS();
        } else if (left != null && operator != null && id != null) {
            return left.generateJS() + operator + id;
        } else if (id != null && argumentList != null) {
            return id + "(" + (argumentList != null ? argumentList.generateJS() : "") + ")";
        } else if (id != null) {
            return id;
        }
        return "";
    }
}