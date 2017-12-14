package cz.zcu.kiv.fjp.enums;

/**
 * Enum values representing types of I/O statement
 * These types can be:
 * read - read input
 * write - write output
 */
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
