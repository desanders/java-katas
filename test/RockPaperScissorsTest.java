/**
 * Created by desanders on 28/07/15. This completes the Rock, Paper, Scissors Kata detailed on http://agilekatas.co.uk/katas/RockPaperScissors-Kata
 */

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class RockPaperScissorsTest {

    @Test
    public void testRockAndScissors() {
        HashMap<String, String> hm = RockPaperScissors.hashMap();
        assertEquals("Player 1 wins!", RockPaperScissors.game("RockScissors", hm));
    }

    @Test
    public void testScissorsAndScissors() {
        HashMap<String, String> hm = RockPaperScissors.hashMap();
        assertEquals("Draw.", RockPaperScissors.game("ScissorsScissors", hm));
    }

    @Test
    public void testPaperAndRock() {
        HashMap<String, String> hm = RockPaperScissors.hashMap();
        assertEquals("Player 1 wins!", RockPaperScissors.game("PaperRock", hm));
    }

    @Test
    public void testPaperAndScissors() {
        HashMap<String, String> hm = RockPaperScissors.hashMap();
        assertEquals("Player 2 wins!", RockPaperScissors.game("PaperScissors", hm));
    }

}
