package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean simpleNum = true;
        if (number != 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    simpleNum = false;
                    break;
                }
            }
        } else {
            simpleNum = false;
        }
        return simpleNum;
    }
}
