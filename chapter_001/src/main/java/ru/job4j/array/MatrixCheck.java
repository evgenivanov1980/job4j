package ru.job4j.array;


public class MatrixCheck {

    /**
     * Метод проверяет в квадратичном массиве диагонали на заполнение значениями true or false
     * @param date квадратичный массив
     * @return возвращет true если все логические значения по большим диагоналям равны, и false если не равны
     */

    public boolean mono(boolean[][] date) {
        boolean result = true;
        for (int i = 0; i < date.length; i++) {
            if (date[i][i] != date[0][0] || date[0][date.length - 1] != date[i][date.length - i - 1])  {
                result = false;
            }
        }
        return result;
    }
}
