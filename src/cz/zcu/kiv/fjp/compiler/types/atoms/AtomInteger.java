package cz.zcu.kiv.fjp.compiler.types.atoms;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.enums.AtomType;

/**
 * Atom of type integer
 * Used to store a single value of type integer
 */
public class AtomInteger extends AbstractAtom {

    /**
     * value
     */
    private int integer;

    /**
     * @param integer value
     */
    public AtomInteger(int integer) {
        super(AtomType.INT);
        this.integer = integer;
    }

    public int getInteger() {
        return integer;
    }

    @Override
    public String toString() {
        return "" + integer;
    }

}
