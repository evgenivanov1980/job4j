package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int[] array) {
        int tmp = 0;
        for (int i = 1; i <= array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j - 1] > array[j]) {
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }

        }
        return array;

    }

}
