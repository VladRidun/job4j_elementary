package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 85.74F;
    }

    public static float rubleToDollar(float value) {
        return value / 75.58F;
    }

    public static float rubleToGbr(float value) {
        return value / 100.0573F;
    }

    public static float euroToRuble(float value) {
        return value * 85.74F;
    }

    public static float dollarToRuble(float value) {
        return value * 75.58F;
    }

    public static float gbrToRuble(float value) {
        return value * 100.0573F;
    }

    public static void main(String[] args) {
        float currency;
        currency = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + currency + " euro.");
        currency = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + currency + " dollar.");
        currency = Converter.rubleToGbr(140);
        System.out.println("140 rubles are " + currency + " gbr.");
        currency = Converter.euroToRuble(5000);
        System.out.println("5000 euro are " + currency + " rub.");
        currency = Converter.dollarToRuble(5000);
        System.out.println("5000 dollars rubles are " + currency + " rub.");
        currency = Converter.gbrToRuble(5000);
        System.out.println("5000 gbr are " + currency + " rub.");
    }
}
