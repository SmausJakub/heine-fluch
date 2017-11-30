package cz.zcu.kiv.fjp.compiler.types.expressions;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.enums.ExpressionType;
import cz.zcu.kiv.fjp.enums.OperatorRelation;

public class ExpressionRelational extends AbstractExpression {

    private OperatorRelation operator;

    private AbstractExpression leftExpression;
    private AbstractExpression rightExpression;

    public ExpressionRelational(AbstractExpression leftExpression, AbstractExpression rightExpression, OperatorRelation operator) {
        super(ExpressionType.REL);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }

    public OperatorRelation getOperator() {
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
