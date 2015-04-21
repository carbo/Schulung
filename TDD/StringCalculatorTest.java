package TDD;

import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void addNumbers() {
        StringCalculator calculator = new StringCalculator();
        Assert.assertEquals(5, calculator.add("2:3"));
        Assert.assertEquals(0, calculator.add(""));
        Assert.assertEquals(3, calculator.add("1;2"));
        Assert.assertEquals(3, calculator.add("1,2"));
        Assert.assertEquals(3, calculator.add("1!2"));
        Assert.assertEquals(6, calculator.add("1,2!3"));
    }
    
    @Test
    public void subtractNumbers() {
        StringCalculator calculator = new StringCalculator();
        Assert.assertEquals(4, calculator.subtract("10,2,4"));
        Assert.assertEquals(0, calculator.subtract(""));
        Assert.assertEquals(-1, calculator.subtract("1;2"));
        Assert.assertEquals(-1, calculator.subtract("1,2"));
        Assert.assertEquals(-1, calculator.subtract("1?2"));
        Assert.assertEquals(-4, calculator.subtract("1,2?3")); 
    }
    
    @Test
    public void multiplyNumbers() {
        StringCalculator calculator = new StringCalculator();
        Assert.assertEquals(6, calculator.multiply("2,3"));
        Assert.assertEquals(0, calculator.multiply(""));
        Assert.assertEquals(2, calculator.multiply("1;2"));
        Assert.assertEquals(2, calculator.multiply("1,2"));
        Assert.assertEquals(2, calculator.multiply("1!2"));
        Assert.assertEquals(6, calculator.multiply("1,2+3"));
        
    }
    
    @Test
    public void testIsInteger() {
        assertFalse(StringCalculator.isInteger("test"));
        assertFalse(!StringCalculator.isInteger("2"));
    }
}
