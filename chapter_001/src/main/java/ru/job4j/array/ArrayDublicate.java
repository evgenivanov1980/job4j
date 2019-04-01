package ru.job4j.array;
import java.util.Arrays;


public class ArrayDublicate {
    public String[] remove(String[] array) {
        String tmp;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i].equals(array[j])) {
                    tmp = array[j];
                    array[j] = array[array.length - i - 1];
                    array[array.length - i - 1] = tmp;
                    index = j;

                }
            }


        }
        return Arrays.copyOf(array, index);
    }
}



