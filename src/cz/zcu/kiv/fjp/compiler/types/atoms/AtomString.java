package cz.zcu.kiv.fjp.compiler.types.atoms;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.enums.AtomType;

public class AtomString extends AbstractAtom {

    private String str;

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
