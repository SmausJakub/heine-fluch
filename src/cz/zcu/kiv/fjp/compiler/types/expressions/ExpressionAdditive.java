package cz.zcu.kiv.fjp.compiler.types.expressions;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.enums.ExpressionType;
import cz.zcu.kiv.fjp.enums.OperatorAddition;

public class ExpressionAdditive extends AbstractExpression {

    private OperatorAddition operator;

    private AbstractExpression leftExpression;
    private AbstractExpression rightExpression;

    public ExpressionAdditive(AbstractExpression leftExpression, AbstractExpression rightExpression, OperatorAddition operator) {
        super(ExpressionType.ADD);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }


    public OperatorAddition getOperator() {
        return operator;
    }

    public AbstractExpression getLeftExpression() {
        return leftExpression;
    }

    public AbstractExpression getRightExpression() {
        return rightExpression;
    }

    @Override
    public String toString() {
        return leftExpression.toString() + " " + operator.getSymbol() + " " + rightExpression.toString();
    }

}
