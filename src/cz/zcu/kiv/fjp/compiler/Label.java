package cz.zcu.kiv.fjp.compiler;

public class Label extends AParsable {


    public Label(int value) {
        super(value);
    }


    @Override
    String getName() {
        return super.name;
    }

    @Override
    Integer getValue() {
        return (Integer) super.value;
    }
}
