package ru.job4j.Loop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.loop.Counter;

import static org.junit.Assert.*;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenSumEvenNumbersFromThreeToFourteenThenFiftyFour() {
        int start = 3;
        int finish = 14;
        int result = Counter.sumByEven(start, finish);
        int expected = 54;
        Assert.assertEquals(expected, result);
    }
}