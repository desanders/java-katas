/**
 * Created by desanders on 03/09/15. This completes the Alternate Square Sum Kata detailed on www.codewars.com
 */
public class alternateSqSum {

    public static int calculate(int[] arr) {

        int odds = 0;
        int evens = 1;
        int arrlength = arr.length;
        int total = 0;

        while (odds <= (arrlength - 1)) {
            total = total + arr[odds];
            odds = odds + 2;
        }

        while (evens <= (arrlength-1)) {
            total = total + (arr[evens]*arr[evens]);
            evens = evens +2;
        }

        return total;
    }

}





//DO UNTIL i > length