package ru.job4j.converter;

import junit.framework.TestCase;
import org.junit.Assert;

public class ConverterTest extends TestCase {

    public void testRubleToEuro() {
        int result = Converter.rubleToEuro(180);
        Assert.assertEquals(2, result);
    }

    public void testRubleToDollar() {
        int result = Converter.rubleToDollar(148);
        Assert.assertEquals(2, result);
    }
}