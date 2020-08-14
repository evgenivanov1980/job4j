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
        Map<Character, Integer> world = new HashMap<>();
        for (int i = 0; i < left.length(); i++) {
            int count = world.getOrDefault(left.charAt(i), 0);
            world.put(left.charAt(i), count + 1);
        }
        for (int j = 0; j < right.length(); j++) {
            if (!world.containsKey(right.charAt(j))) {
                break;
            }
            int count = world.get(right.charAt(j));
            if (count == 1) {
                world.remove(right.charAt(j));
            } else {
                world.put(right.charAt(j), count - 1);
            }


        }
        return world.isEmpty();
    }
}


