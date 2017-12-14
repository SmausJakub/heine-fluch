package cz.zcu.kiv.fjp.compiler.types.expressions;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.enums.ExpressionType;

/**
 * Negation expression
 * template:
 *  not expression
 * e.g.:
 *  not (a < 3)
 */
public class ExpressionNot extends AbstractExpression {

    /**
     * expression
     */
    private AbstractExpression expression;

    /**
     * @param expression expression
     */
    public ExpressionNot(AbstractExpression expression) {
        super(ExpressionType.NOT);
        this.expression = expression;
    }

    public AbstractExpression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return " not " + expression.toString();
    }

}
