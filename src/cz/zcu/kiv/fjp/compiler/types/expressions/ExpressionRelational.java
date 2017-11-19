package cz.zcu.kiv.fjp.compiler.types.expressions;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.enums.ExpressionType;
import cz.zcu.kiv.fjp.enums.OperatorRelation;

public class ExpressionRelational extends AbstractExpression {

    private OperatorRelation operator;

    private AbstractExpression leftExpression;
    private AbstractExpression rightExpression;

    public ExpressionRelational() {
        super(ExpressionType.REL);
    }

    public OperatorRelation getOperator() {
        return operator;
    }

    public void setOperator(OperatorRelation operator) {
        this.operator = operator;
    }

    public AbstractExpression getLeftExpression() {
        return leftExpression;
    }

    public void setLeftExpression(AbstractExpression leftExpression) {
        this.leftExpression = leftExpression;
    }

    public AbstractExpression getRightExpression() {
        return rightExpression;
    }

    public void setRightExpression(AbstractExpression rightExpression) {
        this.rightExpression = rightExpression;
    }

    @Override
    public String toString() {
        return leftExpression + " " + operator.getSymbol() + " " + rightExpression;
    }
}
