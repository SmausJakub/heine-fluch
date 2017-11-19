package cz.zcu.kiv.fjp.abstracts;

import cz.zcu.kiv.fjp.enums.AtomType;

public class AbstractAtom {

    private AtomType type;

    public AbstractAtom(AtomType type) {
        this.type = type;
    }

    public AtomType getType() {
        return type;
    }

}
