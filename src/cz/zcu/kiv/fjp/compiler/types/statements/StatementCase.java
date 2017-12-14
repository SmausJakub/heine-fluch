package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.compiler.types.CaseLimb;
import cz.zcu.kiv.fjp.enums.StatementType;

import java.util.List;

/**
 * Case statement
 * Created by visitors and compiled by compilers
 */
public class StatementCase extends AbstractStatement {

    /**
     * expression
     */
    private AbstractExpression expression;

    /**
     * list of case limbs
     */
    private List<CaseLimb> limbList;

    /**
     * @param expression expression
     * @param limbList   limb list
     * @param line       line number
     */
    public StatementCase(AbstractExpression expression, List<CaseLimb> limbList, int line) {
        super(StatementType.CASE, line);
        this.expression = expression;
        this.limbList = limbList;
    }

    public AbstractExpression getExpression() {
        return expression;
    }

    public List<CaseLimb> getLimbList() {
        return limbList;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append("CASE ").append(expression.toString()).append(" OF ");
        builder.append(limbList.toString());

        return builder.toString();
    }

}
