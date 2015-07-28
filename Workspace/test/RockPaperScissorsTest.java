/**
 * Created by desanders on 28/07/15. This completes the Rock, Paper, Scissors Kata detailed on http://agilekatas.co.uk/katas/RockPaperScissors-Kata
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RockPaperScissorsTest {

    @Test
     public void testRockAndScissors() {
        String[] input = new String[2];
        input[0] = "Rock";
        input[1] = "Scissors";
        assertEquals("Player 1 wins",RockPaperScissors.game(input));
    }

    @Test
    public void testScissorsAndScissors() {
        String[] input = new String[2];
        input[0] = "Scissors";
        input[1] = "Scissors";
        assertEquals("Draw",RockPaperScissors.game(input));
    }

    @Test
    public void testPaperAndRock() {
        String[] input = new String[2];
        input[0] = "Paper";
        input[1] = "Rock";
        assertEquals("Player 1 wins",RockPaperScissors.game(input));
    }

    @Test
    public void testScissorsAndPaper() {
        String[] input = new String[2];
        input[0] = "Scissors";
        input[1] = "Paper";
        assertEquals("Player 1 wins",RockPaperScissors.game(input));
    }

    @Test
    public void testNothingAndScissors() {
        String[] input = new String[2];
        input[0] = "Nothing";
        input[1] = "Scissors";
        assertEquals("You did not enter correct object names, please try again.",RockPaperScissors.game(input));
    }

}
