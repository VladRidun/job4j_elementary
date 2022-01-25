package ru.job4j.array;

import static ru.job4j.array.SwitchArray.*;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; index++) {
            int minNumber = MinDiapason.findMin(data, index, data.length - 1);
            int indexNumber = FindLoop.indexOf(data, minNumber, index, data.length - 1);
            swap(data, indexNumber, index);
        }
        return data;
    }
}
