package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 1; index < pref.length - 1; index++) {
            if (pref[0] != word[index]) {
                result = false;
            }
        }
        return result;
    }
}
