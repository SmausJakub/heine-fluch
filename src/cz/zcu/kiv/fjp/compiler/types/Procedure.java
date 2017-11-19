package cz.zcu.kiv.fjp.compiler.types;


import cz.zcu.kiv.fjp.abstracts.AbstractIdentifier;

public class Procedure extends AbstractIdentifier {

    private int size;

    public Procedure(String name) {
        this(name, 0);
    }

    public Procedure(String name, int size) {
        super(name);
        this.size = size;
    }


    public int getSize() {
        return size;
    }

}
