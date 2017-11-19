package cz.zcu.kiv.fjp.abstracts;

public abstract class AbstractIdentifier {

    private String name;

    public AbstractIdentifier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
