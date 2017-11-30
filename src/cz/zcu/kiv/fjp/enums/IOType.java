package cz.zcu.kiv.fjp.enums;

public enum IOType {

    READ("READ"),
    WRITE("WRITE");

    private String name;

    IOType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
