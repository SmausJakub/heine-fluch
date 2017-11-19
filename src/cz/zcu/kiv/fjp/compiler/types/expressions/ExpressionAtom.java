package cz.zcu.kiv.fjp.compiler.types.expressions;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.enums.ExpressionType;

public class ExpressionAtom extends AbstractExpression {

    private AbstractAtom atom;

    public ExpressionAtom() {
        super(ExpressionType.ATOM);
    }

    public AbstractAtom getAtom() {
        return atom;
    }

    public void setAtom(AbstractAtom atom) {
        this.atom = atom;
    }

    @Override
    public String toString() {
        return atom.toString();
    }

}
