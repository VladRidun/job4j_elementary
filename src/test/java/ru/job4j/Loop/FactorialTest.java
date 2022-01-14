package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.loop.Factorial;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n1 = 5;
        int result = Factorial.calc(n1);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n1 = 0;
        int result = Factorial.calc(n1);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}