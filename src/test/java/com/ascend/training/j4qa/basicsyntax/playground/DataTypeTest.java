package com.ascend.training.j4qa.basicsyntax.playground;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataTypeTest {

    @Test
    public void bytePlay() {
        byte min = Byte.MIN_VALUE;
        byte max = Byte.MAX_VALUE;
        assertEquals(-128, min);
        assertEquals(127, max);
    }

    @Test
    public void shortPlay() {
        short min = Short.MIN_VALUE;
        short max = Short.MAX_VALUE;
        assertEquals(-32768, min);
        assertEquals(32767, max);
    }

    @Test
    public void intPlay() {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        assertEquals(-2147483648, min); // 0x80000000
        assertEquals(2147483647, max); // 0x7fffffff
    }

    @Test
    public void longPlay() {
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
//        assertEquals(-9_223372_036854_775808L, min); // 0x8000000000000000L
//        assertEquals(9_223372_036854_775807L, max); // 0x7fffffffffffffffL

        /**
         * Good to know:
         *
         * Most operating systems designed to run on 64-bit hardware already use signed 64-bit time_t integers.
         * Using a signed 64-bit value introduces a new wraparound date that is over twenty times greater than the
         * estimated age of the universe: approximately 292 billion years from now,
         * at 15:30:08 on Sunday, 4 December 292,277,026,596
         */
    }

    @Test
    public void floatPlay() {
        float min = Float.MIN_VALUE;
        float max = Float.MAX_VALUE;
        assertEquals(1.4E-45f,      min, 0.000000000000000000000000000000000000000000001f);
        assertEquals(3.4028235E38f, max, 0.000000000000000000000000000000000000000000001f);
    }

    @Test
    public void doublePlay() {
        double min = Double.MIN_VALUE;
        double max = Double.MAX_VALUE;
        assertEquals(4.9e-324d,                min, 0.000000000000000000000000000000000000000000001);
        assertEquals(1.7976931348623157e+308d, max, 0.000000000000000000000000000000000000000000001);
    }

    @Test
    public void doubleAwareness() {
        double a = 0.1 * 7;
        double b = 0.7;
        System.out.println(b - a);
    }

    @Test
    public void booleanPrecedenceAwareness() {
        if (true || true && false) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    @Test
    public void charPlay() {
        // 16-bit Unicode character
        char min = '\u0000';
        char max = '\uffff';
        System.out.println(min);
        System.out.println(max);
        assertEquals(0, min);
        assertEquals(65535, max);
    }
}
