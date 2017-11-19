package cz.zcu.kiv.fjp.compiler.types.atoms;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.enums.AtomType;

public class AtomBoolean extends AbstractAtom {

    private boolean bool;

    public AtomBoolean() {
        super(AtomType.BOOLEAN);
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    @Override
    public String toString() {
        return "Boolean Atom value of " + bool;
    }
}
