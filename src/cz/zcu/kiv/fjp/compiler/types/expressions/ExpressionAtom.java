package cz.zcu.kiv.fjp.compiler.types.expressions;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.enums.ExpressionType;

/**
 * Atomic expression
 */
public class ExpressionAtom extends AbstractExpression {

    /**
     * atom
     */
    private AbstractAtom atom;

    /**
     * @param atom atom
     */
    public ExpressionAtom(AbstractAtom atom) {
        super(ExpressionType.ATOM);
        this.atom = atom;
    }

    public AbstractAtom getAtom() {
        return atom;
    }

    @Override
    public String toString() {
        return atom.toString();
    }

}
