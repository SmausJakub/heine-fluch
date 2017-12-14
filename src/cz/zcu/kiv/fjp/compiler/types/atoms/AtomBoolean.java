package cz.zcu.kiv.fjp.compiler.types.atoms;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.enums.AtomType;

/**
 * Atom of type boolean
 * Used to store a single value of type boolean
 */
public class AtomBoolean extends AbstractAtom {

    /**
     * value
     */
    private boolean bool;

    /**
     * @param bool value
     */
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
