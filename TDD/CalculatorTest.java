package TDD;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by cbokeloh on 11.04.15.
 */
@RunWith(JUnit4.class)
public class CalculatorTest {
    @Test
    public void shouldReturnZeroOnEmptyString() {
        assertEquals(0, Calculator.add(""));
    }

    @Test
    public void shouldReturnNumberOnNumber() {
        assertEquals(1, Calculator.add("1"));
    }

    @Test
    public void shouldReturnSumOfTwoNumbersDelimitedByComma() {
        assertEquals(3, Calculator.add("1,2"));
    }

    @Test
    public void shouldReturnMultipleTwoNumbersDelimitedByComma() {
        assertEquals(6, Calculator.add("1,2,3"));
    }
}
