package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHasNot14ThenMinus1() {
        int[] data = {15, 6, 7, 9, 11, 13};
        int el = 14;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas2Then3() {
        int[] data = {5, 4, 3, 2};
        int el = 2;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }
}