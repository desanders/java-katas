import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by desanders on 30/07/15. This completes the kata at this address: http://osherove.com/tdd-kata-1/ .
 */
public class Calculator {

    public static int add(String numbers) {

        int total = 0;

        if (!"".equals(numbers)) {

            numbers = numbers.replace("\n",",");

            Integer[] intarray = toInt(numbers);

            for (int value : intarray) {
                total = total + value;
            }

        } else total = 0;

        return total;

    }

    public static Integer[] toInt(String numbers) {

        String[] ints = numbers.split(Pattern.quote(","));
        Integer[] intarray = new Integer[ints.length];

        int i = 0;

        for (String str : ints) {
            intarray[i++] = Integer.parseInt(str);
        }

        return intarray;

    }

    public static String userInput() {

        Scanner scanner1 = new Scanner( System.in );

        System.out.println("Please enter a string of numbers, separated by commas (,) or line breaks (\n): ");

        return scanner1.nextLine();

    }

    public static void main(String[] args) {
        String numbers = userInput();

        int total = add(numbers);

        System.out.println("The sum of " + numbers + " is " + total);
    }
}
