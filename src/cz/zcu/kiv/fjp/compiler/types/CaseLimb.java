package cz.zcu.kiv.fjp.compiler.types;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;

import java.util.List;

/**
 * Case limb
 */
public class CaseLimb {

    /**
     * atom list
     */
    private List<AbstractAtom> atomList;

    /**
     * statement
     */
    private AbstractStatement statement;

    /**
     * @param atomList  atom list
     * @param statement statement
     */
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
