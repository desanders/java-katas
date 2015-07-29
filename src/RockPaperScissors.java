/**
 * Created by desanders on 28/07/15. This completes the Rock, Paper, Scissors Kata detailed on http://agilekatas.co.uk/katas/RockPaperScissors-Kata. I have also added functionality for a user to input their options.
 */

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static HashMap<String, String> hashMap() {

        HashMap<String,String> hm = new HashMap<>();

        hm.put("RockRock","Draw.");
        hm.put("RockPaper","Computer wins!");
        hm.put("RockScissors","You win!");
        hm.put("ScissorsRock","Computer wins!");
        hm.put("ScissorsPaper", "You win!");
        hm.put("ScissorsScissors","Draw.");
        hm.put("PaperRock","You win!");
        hm.put("PaperScissors", "Computer wins!");
        hm.put("PaperPaper", "Draw.");

        return hm;

    }

    public static String optionSelection() {

        boolean player1Valid = false;
        int lowerBound = 1;
        int upperBound = 4;
        String player1 = "Oops";
        String computerChoice;


        while (!player1Valid) {

            Scanner scanner1 = new Scanner( System.in );

            System.out.print("Please enter your choice of either: Rock, Paper or Scissors: ");

            player1 = scanner1.nextLine();

            player1Valid = "Rock".equals(player1) || "Paper".equals(player1) || "Scissors".equals(player1);

            if (!player1Valid) System.out.println("You entered an incorrect value.");
        }

        Random random = new Random();
        int randomNumber = random.nextInt(upperBound - lowerBound) + lowerBound;

        if (randomNumber == 1) computerChoice = "Rock";
        else if (randomNumber == 2) computerChoice = "Paper";
        else if (randomNumber == 3) computerChoice = "Scissors";
        else computerChoice = "Oops";

        System.out.println("You chose " + player1);
        System.out.println("The computer chose " + computerChoice);

        return player1 + computerChoice;

    }

    public static String game(String combinedOptions, HashMap<String, String> hm) {

        return hm.get(combinedOptions);

    }

    public static void main(String[] args) {

        HashMap<String, String> hm = hashMap();

        String combinedOptions = optionSelection();

        String result = game(combinedOptions, hm);
        System.out.println(result);

    }
}