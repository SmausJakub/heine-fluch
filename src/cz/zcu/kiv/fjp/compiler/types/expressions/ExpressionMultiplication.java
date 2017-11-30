package cz.zcu.kiv.fjp.compiler.types.expressions;


import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.enums.ExpressionType;
import cz.zcu.kiv.fjp.enums.OperatorMultiplication;

public class ExpressionMultiplication extends AbstractExpression {

    private OperatorMultiplication operator;

    private AbstractExpression leftExpression;
    private AbstractExpression rightExpression;

    public ExpressionMultiplication(AbstractExpression leftExpression, AbstractExpression rightExpression, OperatorMultiplication operator) {
        super(ExpressionType.MULT);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }

    public OperatorMultiplication getOperator() {
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
