/**
 * Created by desanders on 05/09/15. This completes the 'Are they the "same"?' kata on CodeWars.
 */
import static org.junit.Assert.*;
import org.junit.Test;


public class compareArraysTest {

    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(compareArrays.comp(a, b), true);
    }

    @Test
    public void test2() {
        int[] a = new int[]{1, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 17, 361, 25921, 361, 20736, 361};
        assertEquals(compareArrays.comp(a, b), false);
    }
}