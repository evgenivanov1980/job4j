package ru.job4j.array;

/**
 * Обертка над строкой
 */

public class ArrayChar {
    private char[] date;

    public ArrayChar(String line) {
        this.date = line.toCharArray();

    }

    /**
     * Проверяет что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинается с префикса
     */

    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        // проверить что массив date имеет первые элементы, одинаковые с value
        for (int index = 0; index < value.length; index++) {
            if (date[index] != value[index]) {
                result = false;
                break;
            }

        }
        return result;

    }


}
