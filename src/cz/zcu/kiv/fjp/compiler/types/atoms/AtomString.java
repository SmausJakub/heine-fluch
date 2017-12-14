package cz.zcu.kiv.fjp.compiler.types.atoms;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.enums.AtomType;

/**
 * Atom of type string
 * Used to store a single value of type string
 */
public class AtomString extends AbstractAtom {

    /**
     * value
     */
    private String str;

    /**
     * @param str value
     */
    public AtomString(String str) {
        super(AtomType.STRING);
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return str;
    }
}
