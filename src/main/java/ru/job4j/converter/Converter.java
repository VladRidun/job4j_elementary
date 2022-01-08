package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 85;
    }

    public static float rubleToDollar(float value) {
        return value / 75;
    }

    public static float euroToRuble(float value) {
        return value * 85;
    }

    public static float dollarToRuble(float value) {
        return value * 75;
    }

    public static void main(String[] args) {
        int in1 = 170;
        int in2 = 150;
        int in3 = 2;
        int expected1 = 2;
        int expected2 = 170;
        int expected3 = 150;

        float out;
        out = Converter.rubleToEuro(in1);
        boolean passed = expected1 == out;
        System.out.println("170 rubles are 2 euro. Test passed: " + passed);
        out = Converter.rubleToDollar(in2);
        passed = expected1 == out;
        System.out.println("150 rubles are 2 dollars. Test result passed: " + passed);
        out = Converter.euroToRuble(in3);
        passed = expected2 == out;
        System.out.println("2 euro  are 170 rubles. Test passed: " + passed);
        out = Converter.dollarToRuble(in3);
        passed = expected3 == out;
        System.out.println("2 dollars  are 150 rubles. Test passed: " + passed);
    }
}
