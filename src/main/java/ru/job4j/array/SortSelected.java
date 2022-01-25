package ru.job4j.array;

import static ru.job4j.array.SwitchArray.*;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int minNumber = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, minNumber, i, data.length - 1);
            swap(data, index, i);
        }
        return data;
    }
}
