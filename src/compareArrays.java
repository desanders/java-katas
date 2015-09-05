/**
 * Created by desanders on 05/09/15. This completes the 'Are they the "same"?' kata on CodeWars.
 */
public class compareArrays {

    public static boolean comp(int[] a, int[] b) {

        int[] aCopy = a;
        int[] bCopy = b;

        int aLength = aCopy.length;
        int bLength = bCopy.length;

        if (aLength != bLength) return false;

        for (int value : aCopy) {
            int valueSq = value * value;
            int i = 0;

            for ( i = 0; i < aCopy.length; i++ ) {
                if (valueSq == bCopy[i]) bCopy[i] = -1;
            }
        }

        for ( int afterCheck : bCopy) {
            if ( afterCheck != -1 ) return false;
        }

        return true;
    }
}