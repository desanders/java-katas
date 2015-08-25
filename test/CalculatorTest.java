import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by desanders on 30/07/15.
 */
public class CalculatorTest {

    @Test
    public void test_noNumbers() {
        assertEquals(0,Calculator.add(""));
    }

    @Test
     public void test_oneNumber() {
        assertEquals(1,Calculator.add("1"));
    }

    @Test
    public void test_twoNumbers() {
        assertEquals(3,Calculator.add("1,2"));
    }

    @Test
    public void test_threeNumbers() {
        assertEquals(52,Calculator.add("17,21,14"));
    }

    @Test
    public void test_elevenNumbers_lineBreak() {
        assertEquals(204,Calculator.add("17\n21,14\n5,13,7,3\n87,2,34,1"));
    }

}