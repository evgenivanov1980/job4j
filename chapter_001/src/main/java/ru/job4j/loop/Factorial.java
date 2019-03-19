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
        int result = 1;
        for (int num = 1; num <= n; num++) {
            result =  num * result;
            }
     return n != 0 ? result : 1;
    }

}
