package cz.zcu.kiv.fjp.interpret;

import java.nio.ByteBuffer;

public class FloatingInStack {

    double floatingValue;


    public FloatingInStack(double floatingValue) {
        this.floatingValue = floatingValue;
    }


    public int[] createComponents(double floatingValue) {
        int[] values = new int[2];

        byte[] bytes = new byte[8];
        ByteBuffer.wrap(bytes).putDouble(floatingValue);

        for (int i = 0; i < 4; i++)
        {
            values[0] |= ((int) bytes[i] & 0xffL) << (8 * i);
            values[1] |= ((int) bytes[i + 4] & 0xffL) << (8 * i);
        }

        return values;
    }

    /**
     *
     * @param ints
     * @return
     */
    public double toDouble(int[] ints) {

        byte[] bytes = new byte[8];

        for (int i = 0; i < 4; i++) {
            bytes[i] |= ( ints[0] >> (8 * i)) & 0xffL;
            bytes[i+4] |=  ( ints[1] >> (8 * i)) & 0xffL;
        }

        return ByteBuffer.wrap(bytes).getDouble();
    }



    public double getFloatingValue() {
        return floatingValue;
    }

    public void setFloatingValue(double floatingValue) {
        this.floatingValue = floatingValue;
    }


}
