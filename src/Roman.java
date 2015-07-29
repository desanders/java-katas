/**
 * Created by desanders on 24/07/15. This completes the Roman Numerals Kata detailed on http://agilekatas.co.uk/katas/romannumerals-kata.
 */

import java.util.*;

public class Roman {

    public static String converter(int arabic) {

        String roman = "";

        while (arabic >= 1000) {
            roman = roman + "M";
            arabic = arabic - 1000;
        }

        while (arabic >= 900) {
            roman = roman + "CM";
            arabic = arabic - 900;
        }

        while (arabic >= 500) {
            roman = roman + "D";
            arabic = arabic - 500;
        }

        while (arabic >= 400) {
            roman = roman + "CD";
            arabic = arabic - 400;
        }

        while (arabic >= 100) {
            roman = roman + "C";
            arabic = arabic - 100;
        }

        while (arabic >= 90) {
            roman = roman + "XC";
            arabic = arabic - 90;
        }

        while (arabic >= 50) {
            roman = roman + "L";
            arabic = arabic - 50;
        }

        while (arabic >= 40) {
            roman = roman + "XL";
            arabic = arabic - 40;
        }

        while (arabic >= 10) {
            roman = roman + "X";
            arabic = arabic - 10;
        }

        while (arabic >= 9) {
            roman = roman + "IX";
            arabic = arabic - 9;
        }

        while (arabic >= 5) {
            roman = roman + "V";
            arabic = arabic - 5;
        }

        while (arabic >= 4) {
            roman = roman + "IV";
            arabic = arabic - 4;
        }

        while (arabic >= 1) {
            roman = roman + "I";
            arabic = arabic - 1;
        }

        return roman;
    }

    public static int userInput() {

        boolean arabicValid = false;

        int arabicInt = 0;

        while (!arabicValid) {

            Scanner scanner = new Scanner( System.in );

            System.out.print("Please enter a positive number: ");

            String arabicString = scanner.nextLine();

            arabicInt = Integer.parseInt(arabicString);

            if (arabicInt > 0) arabicValid = true;
            else System.out.println("You entered a non-positive number.");
        }

        return arabicInt;
    }

    public static void main(String[] args) {
        int arabic = userInput();
        String roman = converter(arabic);
        System.out.println("You entered " + arabic + ".");
        System.out.println("This is equal to the Roman numeral(s) " + roman + ".");
    }
}