package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void testRubleToEuro() {
        int result = Converter.rubleToEuro(180);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testRubleToDollar() {
        int result = Converter.rubleToDollar(148);
        Assert.assertEquals(2, result);
    }
}