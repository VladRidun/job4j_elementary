package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 2));
        System.out.println("Результат расчета sumSubAndDiv равен: " + sumSubAndDiv(10, 2));
        System.out.println("Результат расчета sumAllOper равен: " + sumAllOperations(10, 2));
    }

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumSubAndDiv(double first, double second) {
        return subtract(first, second)
                + division(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return sum(first, second) + subtract(first, second) + multiply(first, second) + division(first, second);
    }
}