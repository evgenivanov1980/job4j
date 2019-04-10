package ru.job4j.array;

public class ArrayMerge {

    /**
     * Метод Слияния двух массиов.
     * @param left первый массив
     * @param right второй массив
     * @return result отсортированный массив который получается в результате слияния массивов left и right
     */

    public int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int[] result = new int[left.length + right.length];
        for (int k = 0; k < result.length; k++) {

            if (i > left.length - 1) {  // если кончился первый массив, добаляем оставшиеся значения из второго массива
                result[k] = right[j];
                j++;


            } else if (j > right.length - 1) {  // если кончился второй массив, добавляем оставшиеся значения из первого массива
                result[k] = left[i];
                i++;

            } else if (left[i] < right[j]) {
                result[k] = left[i];
                i++;

            } else {
                result[k] = right[j];
                j++;
            }

        }
        return result;
    }
}




