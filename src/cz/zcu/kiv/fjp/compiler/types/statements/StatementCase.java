package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.compiler.types.CaseLimb;
import cz.zcu.kiv.fjp.enums.StatementType;

import java.util.List;

public class StatementCase extends AbstractStatement {

    private AbstractExpression expression;
    private List<CaseLimb> limbList;

    public StatementCase(AbstractExpression expression, List<CaseLimb> limbList) {
        super(StatementType.CASE);
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
        if (isLabelled()) {
            builder.append(getLabel().getValue()).append(": ");
        }
        builder.append("CASE ").append(expression.toString()).append(" OF ");
        builder.append(limbList.toString());

        return builder.toString();
    }

}
