/**
 * Created by desanders on 03/09/15. This completes the Multi-tap Keypad Text Entry on an Old Mobile Phone Kata detailed on www.codewars.com
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class KeypadTest {
    @Test
    public void simpleTest() {
        assertEquals(9, Keypad.calculatePresses("LOL"));
        assertEquals(13, Keypad.calculatePresses("HOW R U"));
        assertEquals(10, Keypad.calculatePresses("99"));
    }
}