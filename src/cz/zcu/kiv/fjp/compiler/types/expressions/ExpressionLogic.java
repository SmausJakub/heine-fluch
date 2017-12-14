package cz.zcu.kiv.fjp.compiler.types.expressions;


import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.enums.ExpressionType;
import cz.zcu.kiv.fjp.enums.OperatorLogic;

/**
 * Logic expression
 */
public class ExpressionLogic extends AbstractExpression {

    /**
     * operator
     */
    private OperatorLogic operator;

    /**
     * left expression
     */
    private AbstractExpression leftExpression;

    /**
     * right expression
     */
    private AbstractExpression rightExpression;

    /**
     * @param leftExpression  left expression
     * @param rightExpression right expressions
     * @param operator        operator
     */
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
