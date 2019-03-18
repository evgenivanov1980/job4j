package ru.job4j.condition;

public class MultiMax {
    /**
     * Метод вычисления максимального числа из трех
     * @param first первое число
     * @param second второе число
     * @param third третье число
     * @return возврашет максимальное число из трех
     */
    public int max(int first, int second, int third) {
        int result = first > second ? first : second;
        return result > third ? result : third;
    }
}
