package ru.job4j.collection;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class FreezeStr {

    /**
     * Метод сравнивает две строки и определяет явлется ли одна строка переставлением символов другой строки
     *
     * @param left  первая строка
     * @param right вторая строка
     * @return result возвращает результат
     */

    public static boolean eq(String left, String right) {
        char[] cha = left.toCharArray();
        char[] cha1 = right.toCharArray();
        Map<Character, Integer> world1 = new HashMap<>();
        world1.put(cha[0], 1);
        for (int i = 1; i < cha.length; i++) {
            if (world1.containsKey(cha[i])) {
                world1.put(cha[i], (world1.get(cha[i])) + 1);
            } else {
                world1.put(cha[i], 1);
            }
        }
        for (int j = 0; j < cha1.length; j++) {
            if (world1.containsKey(cha1[j])) {
                world1.put(cha1[j], world1.get(cha1[j]) - 1);
            }
            else {
                break;
            }
            if (world1.get(cha1[j]) == 0) {
                world1.remove(cha1[j]);
            }

        }
        return world1.isEmpty();
    }
}


