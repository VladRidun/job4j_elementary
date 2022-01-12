package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean simpleNumber = true;
        if (number != 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    simpleNumber = false;
                    break;
                }
            }
        } else {
            simpleNumber = false;
        }
        return simpleNumber;
    }
}
