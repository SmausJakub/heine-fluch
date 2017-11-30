package cz.zcu.kiv.fjp.compiler.types.expressions;


import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.enums.ExpressionType;
import cz.zcu.kiv.fjp.enums.OperatorLogic;

public class ExpressionLogic extends AbstractExpression {

    private OperatorLogic operator;

    private AbstractExpression leftExpression;
    private AbstractExpression rightExpression;

    public ExpressionLogic(AbstractExpression leftExpression, AbstractExpression rightExpression, OperatorLogic operator) {
        super(ExpressionType.LOG);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }

    public OperatorLogic getOperator() {
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
