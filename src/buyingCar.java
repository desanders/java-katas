/**
 * Created by desanders on 03/09/15. This completes the Buying A Car Kata detailed on www.codewars.com
 */

public class buyingCar {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {

        int month = 0;
        double updatedPriceOld = startPriceOld;
        double updatedPriceNew = startPriceNew;
        int totalSavings = 0;
        double remainder;
        int roundedRemainder;
        int[] result = new int[2];

        while ( updatedPriceNew > (updatedPriceOld + totalSavings) ) {

            month = month + 1;

            if (month % 2 == 0) percentLossByMonth = percentLossByMonth + 0.5;

            totalSavings = totalSavings + savingperMonth;
            updatedPriceOld = updatedPriceOld - (updatedPriceOld * (percentLossByMonth / 100) );
            updatedPriceNew = updatedPriceNew - (updatedPriceNew * (percentLossByMonth / 100) );
        }

        remainder = (totalSavings + updatedPriceOld) - updatedPriceNew;

        roundedRemainder = (int)remainder;

        result[0] = month;
        result[1] = roundedRemainder;

        return result;
    }
}