package cz.zcu.kiv.fjp.compiler.types.expressions;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.enums.ExpressionType;
import cz.zcu.kiv.fjp.enums.OperatorRelation;

/**
 * Relational expression
 * template:
 *  leftExpression operator rightExpression
 * e.g.:
 *  a = b
 */
public class ExpressionRelational extends AbstractExpression {

    /**
     * operator
     */
    private OperatorRelation operator;

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
