package ru.job4j.condition;

public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;
        /* first больше second? */
        boolean result = first > second;
        System.out.println(result);
        /* first меньше second? */
        result = first < second;
        System.out.println(result);
        /* first равна second? */
        result = first == second;
        System.out.println(result);
    }
}
