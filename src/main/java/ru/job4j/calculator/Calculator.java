package ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int result;
        result = one + two;
        System.out.println(result);
        one = 6;
        result = one / two;
        System.out.println(result);
        one = 5;
        result = one - two;
        System.out.println(result);
        one = two * 2;
        result = one * two;
        System.out.println(result);

    }
}