package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

import java.util.List;

public class StatementCompound extends AbstractStatement {

    private List<AbstractStatement> statementList;

    public StatementCompound(List<AbstractStatement> statementList) {
        super(StatementType.COMPOUND);
        this.statementList = statementList;
    }

    public List<AbstractStatement> getStatementList() {
        return statementList;
    }

    @Override
    public String toString() {

        if (statementList.isEmpty()) {
            return "BEGIN" + " END";
        } else {
            return "BEGIN " + statementList.toString() + " END";
        }

    }
}
