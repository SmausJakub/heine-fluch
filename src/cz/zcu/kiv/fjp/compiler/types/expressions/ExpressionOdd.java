package cz.zcu.kiv.fjp.compiler.types.expressions;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.enums.ExpressionType;

/**
 * Odd Expression
 * template:
 * ODD expression
 * odd is not contained within class
 * e.g.:
 * ODD 5
 */
public class ExpressionOdd extends AbstractExpression {

    /**
     * expression
     */
    private AbstractExpression expression;

    /**
     * @param expression odd expression
     */
    public ExpressionOdd(AbstractExpression expression) {
        super(ExpressionType.ODD);
        this.expression = expression;
    }

    public AbstractExpression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "ODD " + expression.toString();
    }
}
