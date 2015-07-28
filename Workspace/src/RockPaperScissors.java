/**
 * Created by desanders on 28/07/15. This completes the Rock, Paper, Scissors Kata detailed on http://agilekatas.co.uk/katas/RockPaperScissors-Kata. I have also added functionality for a user to input their options.
 */

import java.io.InputStream;
import java.util.Scanner;

public class RockPaperScissors {

    public static String[] userInput() {

        Scanner scanner1 = new Scanner( System.in );
        Scanner scanner2 = new Scanner( System.in );
        String[] input = new String[2];

        System.out.print( "Player 1, please enter your choice of: Rock, Paper or Scissors: " );

        input[0] = scanner1.nextLine();

        System.out.print( "Player 2, please enter your choice of: Rock, Paper or Scissors: " );

        input[1] = scanner2.nextLine();

        System.out.println("Player 1 has chosen " + input[0] + ".");
        System.out.println("Player 2 has chosen " + input[0] + ".");

        return input;

    }

    public static String game(String[] input) {
        String result;

        if ("Rock".equals(input[0]) && "Scissors".equals(input[1])) result = "Player 1 wins";
        else if ("Rock".equals(input[0]) && "Paper".equals(input[1])) result = "Player 2 wins";
        else if ("Rock".equals(input[0]) && "Rock".equals(input[1])) result = "Draw";
        else if ("Scissors".equals(input[0]) && "Paper".equals(input[1])) result = "Player 1 wins";
        else if ("Scissors".equals(input[0]) && "Rock".equals(input[1])) result = "Player 2 wins";
        else if ("Scissors".equals(input[0]) && "Scissors".equals(input[1])) result = "Draw";
        else if ("Paper".equals(input[0]) && "Rock".equals(input[1])) result = "Player 1 wins";
        else if ("Paper".equals(input[0]) && "Scissors".equals(input[1])) result = "Player 2 wins";
        else if ("Paper".equals(input[0]) && "Paper".equals(input[1])) result = "Draw";
        else result = "You did not enter correct object names, please try again.";

        return result;

    }

    public static void main(String[] args) {

        String[] input;

        input = userInput();

        String result = game(input);

        System.out.print(result);

    }
}
