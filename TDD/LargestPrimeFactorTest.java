package TDD;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cbokeloh on 11.04.15.
 */
public class LargestPrimeFactorTest {
    @Test
    public void testLargestPrimeFactors() {
        Assert.assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2));
        Assert.assertEquals(3, LargestPrimeFactor.largestPrimeFactor(6));
        Assert.assertEquals(5, LargestPrimeFactor.largestPrimeFactor(15));
        Assert.assertEquals(7, LargestPrimeFactor.largestPrimeFactor(147));
        Assert.assertEquals(17, LargestPrimeFactor.largestPrimeFactor(17));
        Assert.assertEquals(31, LargestPrimeFactor.largestPrimeFactor(392832));
        Assert.assertEquals(893933, LargestPrimeFactor.largestPrimeFactor(1787866));
    }

}
