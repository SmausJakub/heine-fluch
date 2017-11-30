package cz.zcu.kiv.fjp.compiler.types.atoms;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.enums.AtomType;

public class AtomInteger extends AbstractAtom {

    private int integer;

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
