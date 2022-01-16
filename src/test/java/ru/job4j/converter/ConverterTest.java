package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert170RblThen2Euro() {
        float in1 = 170;
        float expected = 2;
        float out = Converter.rubleToEuro(in1);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert150RblThen2Dollar() {
        float in1 = 150;
        float expected = 2;
        float out = Converter.rubleToDollar(in1);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert2euroTo170Ruble() {
        float in1 = 2;
        float expected = 170;
        float out = Converter.euroToRuble(in1);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert2dollarTo150Ruble() {
        float in1 = 2;
        float expected = 150;
        float out = Converter.dollarToRuble(in1);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}