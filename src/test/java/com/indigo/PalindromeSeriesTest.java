package com.indigo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by miztli on 22/02/18.
 */
public class PalindromeSeriesTest {
    @Test
    public void getCloserPalindrome_withExpectededResults(){
        PalindromeSeries palindromeSeries = new PalindromeSeries();
        Assert.assertEquals(palindromeSeries.getCloserPalindrome(101110),101101);
        Assert.assertEquals(palindromeSeries.getCloserPalindrome(800000),793397);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getCloserPalindrome_withHigherNumber_And_ExpectIllegalArgumentException(){
        PalindromeSeries palindromeSeries = new PalindromeSeries();
            palindromeSeries.getCloserPalindrome(1000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getCloserPalindrome_withLowerNumber_And_ExpectIllegalArgumentException(){
        PalindromeSeries palindromeSeries = new PalindromeSeries();
        palindromeSeries.getCloserPalindrome(101100);
    }

    @Test
    public void isPalindrome_withNegativeNumber(){
        PalindromeSeries palindromeSeries = new PalindromeSeries();
        Assert.assertFalse(palindromeSeries.isPalindrome(-1));
    }

    @Test
    public void isPalindrome_withPositiveNumber(){
        PalindromeSeries palindromeSeries = new PalindromeSeries();
        Assert.assertFalse(palindromeSeries.isPalindrome(0));
    }

    @Test
    public void isPalindrome_withPositiveNumber_And_PalindromeEvenNumber(){
        PalindromeSeries palindromeSeries = new PalindromeSeries();
        Assert.assertTrue(palindromeSeries.isPalindrome(1001));
    }

    @Test
    public void isEven_withPositiveNumber(){
        PalindromeSeries palindromeSeries = new PalindromeSeries();
        Assert.assertTrue(palindromeSeries.isEven(1001));
    }

    @Test
    public void isEven_withNegativeNumber(){
        PalindromeSeries palindromeSeries = new PalindromeSeries();
        Assert.assertFalse(palindromeSeries.isEven(-101));
    }
}
