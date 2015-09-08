/**
 * Created by desanders on 06/09/15.
 */

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class bowlingTest {

    @Test
    public void test1() {
        String[] individualScores = new String[] {"1","9","/","1","X","4","7","4","/","5"};
        String[] result = new String[] {"1","9","11","1","21","4","7","4","15","5"};
        assertArrayEquals(result, bowling.calculateScore(individualScores));
    }



}