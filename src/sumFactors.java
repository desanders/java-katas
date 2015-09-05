/**
 * Created by desanders on 03/09/15.
 */
public class sumFactors {

    public static int solution(int value) {

        int i = 0;
        int sum = 0;

//        This cycles through every number BELOW the number input. It then see's if it's modulus when divided by 3 or 5 is 0. If so, it is divisible by 3 or 5 and is therefore added to the sum.

        while ( i < value ) {
            if ( (i % 3 == 0 || i % 5 == 0) ) {
                sum += i;
            }
            i++;
        }
        return sum;
    }
}

/**
 If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

 Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
 **/