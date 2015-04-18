package TDD;

/**
 * Created by cbokeloh on 11.04.15.
 */
public class LargestPrimeFactor {
    /**
     * @return largest prime factor of a number
     */
    public static int largestPrimeFactor(long number) {
        int i;
        long copyOfInput = number;
        for (i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                copyOfInput /= i;
                i--;
            }
        }
        return i;
    }
}


