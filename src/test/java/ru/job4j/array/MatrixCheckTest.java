package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void testMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertTrue(result);
    }

    @Test
    public void testMonoHorizontalnotX() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {'R', 'R', 'R'},
        };
        int row = 2;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertFalse(result);
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasMonoVerticalnotX() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        int column = 1;
        boolean result = MatrixCheck.monoVertical(input, column);
        Assert.assertFalse(result);
    }
}