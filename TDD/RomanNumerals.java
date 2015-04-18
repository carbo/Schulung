package TDD;

/**
 * Created by cbokeloh on 11.04.15.
 */
public class RomanNumerals {
    private static final int[]    VALUES  = { 1000, 900,  500, 400,  100, 90,   50,  40,   10,  9,    5,   4,    1   };
    private static final String[] SYMBOLS = { "M",  "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
    public static String arabicToRoman(int arabic) {
        StringBuilder builder = new StringBuilder();
        int rest = arabic;
        for (int i = 0; i < VALUES.length; i++) {
            rest = appendRomanNumerals(rest, VALUES[i], SYMBOLS[i], builder);
        }
        return builder.toString();
    }

    private static int appendRomanNumerals(int rest, int i, String ix, StringBuilder builder) {
        while(rest >= i) {
            builder.append(ix);
            rest -= i;
        }
        return rest;
    }
}
