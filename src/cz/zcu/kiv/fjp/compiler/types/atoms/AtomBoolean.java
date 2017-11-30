package cz.zcu.kiv.fjp.compiler.types.atoms;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.enums.AtomType;

public class AtomBoolean extends AbstractAtom {

    private boolean bool;

    public AtomBoolean(boolean bool) {
        super(AtomType.BOOLEAN);
        this.bool = bool;
    }

    public boolean isBool() {
        return bool;
    }

    @Override
    public String toString() {
        return "" + bool;
    }
}
