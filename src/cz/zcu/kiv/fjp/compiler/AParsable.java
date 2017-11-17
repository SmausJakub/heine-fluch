package cz.zcu.kiv.fjp.compiler;

public abstract class AParsable<E> {

    String name;
    E value;

    AParsable(String name) {
        this(name, null);
    }

    AParsable(E value) {
        this(null, value);
    }

    AParsable(String name, E value) {
        this.name = name;
        this.value = value;
    }

    abstract String getName();

    abstract E getValue();


}
