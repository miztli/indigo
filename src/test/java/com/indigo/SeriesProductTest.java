package com.indigo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by miztli on 22/02/18.
 */
public class SeriesProductTest {

    @Test
    public void getMaxProduct_withExpectedResponse(){
        SeriesProduct seriesProduct = new SeriesProduct();
        Assert.assertEquals(seriesProduct.getMaxProduct(10,5,3675356291L),3150);
        Assert.assertEquals(seriesProduct.getMaxProduct(10,5,2709360626L),0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void getMaxProduct_withLessConsecutiveDigits_thanAccepted(){
        SeriesProduct seriesProduct = new SeriesProduct();
        seriesProduct.getMaxProduct(10,1,3675356291L);
    }
    @Test(expected = IllegalArgumentException.class)
    public void getMaxProduct_withMoreConsecutiveDigits_thanAccepted(){
        SeriesProduct seriesProduct = new SeriesProduct();
        seriesProduct.getMaxProduct(10,8,3675356291L);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getMaxProduct_withGreaterConsecutiveDigits_thanAccepted(){
        SeriesProduct seriesProduct = new SeriesProduct();
        seriesProduct.getMaxProduct(10,7,3675356291L);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getMaxProduct_withNumberLessThanConsecutiveDigits(){
        SeriesProduct seriesProduct = new SeriesProduct();
        seriesProduct.getMaxProduct(10,6,5);
    }

}
