package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2==0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(1, 3));
        System.out.println(sum(3, 3));
        System.out.println(sum(10, 100));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
        System.out.println(sumByEven(5, 12));
        System.out.println(sumByEven(7, 16));
        System.out.println(sumByEven(3, 15));
    }
}