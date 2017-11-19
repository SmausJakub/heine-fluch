package cz.zcu.kiv.fjp.abstracts;

import cz.zcu.kiv.fjp.enums.AtomType;

public class AbstractAtom {

    private AtomType atomType;

    public AbstractAtom(AtomType atomType) {
        this.atomType = atomType;
    }

    public AtomType getAtomType() {
        return atomType;
    }

}
