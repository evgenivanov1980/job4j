package ru.job4j.array;

public class Matrix {

    /**
     * Метод составляет таблицу умножения в квадратичном массиве от 1 до 9
     * @param size размер массива
     * @return возвращает таблицу умножения от 1 до 9
     */

    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);

            }
        }
        return table;
    }
}
