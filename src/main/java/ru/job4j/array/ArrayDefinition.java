package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        String[] names = new String[4];
        float[] prices = new float[40];
        names[0] = "Petr Arsentev";
        names[1] = "Korobeinikov Stas";
        names[2] = "Kartashova Elena";
        names[3] = "Ridun Vlad";
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
    }
}