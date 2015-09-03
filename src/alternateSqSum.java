/**
 * Created by desanders on 03/09/15. This completes the Alternate Square Sum Kata detailed on www.codewars.com
 */
public class alternateSqSum {

    public static int calculate(int[] arr) {

        int len = arr.length;
        if (len == 0) return 0;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) sum += arr[i];
            else sum+= (arr[i] * arr[i]);
        }

        return sum;
    }

}





//DO UNTIL i > length