package TDD;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cbokeloh on 11.04.15.
 */
public class RomanNumeralsTest {
    @Test
    public void one() {
        Assert.assertEquals("1", "I", RomanNumerals.arabicToRoman(1));
        Assert.assertEquals("2", "II", RomanNumerals.arabicToRoman(2));
        Assert.assertEquals("3", "III", RomanNumerals.arabicToRoman(3));
        Assert.assertEquals("4", "IV", RomanNumerals.arabicToRoman(4));
        Assert.assertEquals("5", "V", RomanNumerals.arabicToRoman(5));
        Assert.assertEquals("6", "VI", RomanNumerals.arabicToRoman(6));
        Assert.assertEquals("9", "IX", RomanNumerals.arabicToRoman(9));
    }
}
