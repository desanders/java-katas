/**
 * Created by desanders on 05/09/15. This completes the 'Are they the "same"?' kata on CodeWars.
 */
public class compareArrays {

    public static boolean comp(int[] a, int[] b) {

        int aLength = a.length;
        int bLength = b.length;

        if (aLength != bLength) return false;

        for (int value : a) {
            int valueSq = value * value;
            int i = 0;

            for ( i = 0; i < a.length; i++ ) {
                if (valueSq == b[i]) b[i] = -1;
            }
        }

        for ( int afterCheck : b) {
            if ( afterCheck != -1 ) return false;
        }

        return true;
    }
}