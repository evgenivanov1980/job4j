package ru.job4j.loop;

public class Factorial {

    /**
     * Метод вычисления факториала
     *
     * Формула
     ** n! = n*(n-1)
     *
     * @param n факториал
     * @return возвращает вычисленный факториал n!
     */

    public int calc(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 0;
        for (int num = 1; num <= n; num++) {
            result = num != 1 ? num * result : 1;

            }
     return result;
    }

}
