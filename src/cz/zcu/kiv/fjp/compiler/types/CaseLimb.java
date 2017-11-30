package cz.zcu.kiv.fjp.compiler.types;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;

import java.util.List;

public class CaseLimb {

    private List<AbstractAtom> atomList;

    private AbstractStatement statement;

    public CaseLimb(List<AbstractAtom> atomList, AbstractStatement statement) {
        this.atomList = atomList;
        this.statement = statement;
    }

    public List<AbstractAtom> getAtomList() {
        return atomList;
    }

    public AbstractStatement getStatement() {
        return statement;
    }

    public String toString() {
        return atomList.toString() + " : " + statement.toString();
    }
}
