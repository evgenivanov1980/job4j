package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Collections;



public class FreezeStr {

    /**
     * Метод сравнивает две строки и определяет явлется ли одна строка переставлением символов другой строки
     * @param left первая строка
     * @param right вторая строка
     * @return result возвращает результат
     */

    public static boolean eq(String left, String right) {
        boolean result = false;
        ArrayList<Character> world1 = new ArrayList<>();
        ArrayList<Character> world2 = new ArrayList<>();
        for (int i = 0; i < left.length(); i++) {
            world1.add(left.charAt(i));
        }
        for (int j = 0; j < right.length(); j++) {
            world2.add(right.charAt(j));
        }
        Collections.sort(world1);
        Collections.sort(world2);
        if (world1.equals(world2)) {
            result = true;
        }
        return result;

    }
}
