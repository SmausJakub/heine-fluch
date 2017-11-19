package cz.zcu.kiv.fjp.compiler.types.expressions;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.enums.ExpressionType;
import cz.zcu.kiv.fjp.enums.OperatorAddition;

public class ExpressionAdditive extends AbstractExpression {

    private OperatorAddition operator;

    private AbstractExpression leftExpression;
    private AbstractExpression rightExpression;

    public ExpressionAdditive() {
        super(ExpressionType.ADD);
    }


    public OperatorAddition getOperator() {
        return operator;
    }

    public void setOperator(OperatorAddition operator) {
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
