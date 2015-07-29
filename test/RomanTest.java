/**
 * Created by desanders on 24/07/15. This completes the Roman Numerals Kata detailed on http://agilekatas.co.uk/katas/romannumerals-kata.
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanTest {

    @Test
    public void testNumber1() {
        assertEquals("I",Roman.converter(1));
    }

    @Test
    public void testNumber5() {
        assertEquals("V",Roman.converter(5));
    }

    @Test
    public void testNumber10() {
        assertEquals("X",Roman.converter(10));
    }

    @Test
    public void testNumber50() {
        assertEquals("L",Roman.converter(50));
    }

    @Test
    public void testNumber100() {
        assertEquals("C",Roman.converter(100));
    }

    @Test
    public void testNumber500() {
        assertEquals("D",Roman.converter(500));
    }

    @Test
    public void testNumber1000() {
        assertEquals("M",Roman.converter(1000));
    }

    @Test
    public void testNumber2() {
        assertEquals("II",Roman.converter(2));
    }

    @Test
    public void testNumber6() {
        assertEquals("VI",Roman.converter(6));
    }

    @Test
    public void testNumber781() {
        assertEquals("DCCLXXXI",Roman.converter(781));
    }

    @Test
    public void testNumber922() {
        assertEquals("CMXXII",Roman.converter(922));
    }

    @Test
    public void testNumber391() {
        assertEquals("CCCXCI",Roman.converter(391));
    }

}
