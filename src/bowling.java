/**
 * Created by desanders on 06/09/15.
 */


public class bowling {

    public static String[] calculateScore(String[] individualScores) {

        String[] result = new String[10];
        int i;

        for (i = 9; i > -1; i--) {

            if (individualScores[i] == "X") {
                result = strike(result, individualScores, i);
            }
            else if (individualScores[i] == "/") {
                result = spare(result, individualScores, i);
            }
            else {
                result = normalScore(result, individualScores, i);
            }
        }

        return result;
    }

    public static String[] strike(String[] result, String[] individualScores, int index) {

        int resultInt = 10 + Integer.parseInt(individualScores[index + 1]) + Integer.parseInt(individualScores[index + 2]);
        result[index] = Integer.toString(resultInt);
        return result;
    }

    public static String[] spare(String[] result, String[] individualScores, int index) {
        int resultInt = 10 + Integer.parseInt(individualScores[index + 1]);
        result[index] = Integer.toString(resultInt);
        return result;
    }

    public static String[] normalScore(String[] result, String[] individualScores, int index) {
        result[index] = individualScores[index];
        return result;
    }

}

/**
 *
 * LOGIC:
 * Input array which holds score of each turn. This IGNORES THE THIRD THROW ON YOUR LAST TURN.
 *
**/