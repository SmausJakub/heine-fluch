package cz.zcu.kiv.fjp.compiler.types.expressions;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.enums.ExpressionType;
import cz.zcu.kiv.fjp.enums.OperatorAddition;

/**
 * Additive expression
 * template:
 *  leftExpression operator rightExpression
 * e.g.:
 *  1 + 2
 */
public class ExpressionAdditive extends AbstractExpression {

    /**
     * operator
     */
    private OperatorAddition operator;

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
     * @param rightExpression right expression
     * @param operator        operator
     */
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
