package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when20to00then2() {
        double expected = 2;
        int x1 = 2;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to23then2() {
        double expected = 2.23;
        int x1 = 4;
        int y1 = 2;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when53to13then4() {
        double expected = 4;
        int x1 = 5;
        int y1 = 3;
        int x2 = 1;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}