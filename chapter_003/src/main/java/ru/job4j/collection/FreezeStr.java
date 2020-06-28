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
        boolean result = true;
        int key1 = 1;
        int key2 = 1;
        int key3 = 0;
        int counter = 0;
        int counter1 = 0;

        Map<Integer, Character> world1 = new HashMap<>();
        Map<Integer, Character> world2 = new HashMap<>();
        for (int i = 0; i < left.length(); i++) {
            world1.put(key1, left.charAt(i));
            key1++;
        }
        for (int j = 0; j < right.length(); j++) {
            world2.put(key2, right.charAt(j));
            key2++;
        }
        for (Map.Entry<Integer, Character> entry : world1.entrySet()) {
            for (Map.Entry<Integer, Character> entry1 : world1.entrySet()) {
                if (entry.getValue().equals(entry1.getValue())) {
                    counter++;
                }
            }
            key3 = 0;
            if (key3 < world2.size()) {
                for (Map.Entry<Integer, Character> entry4 : world2.entrySet()) {
                    if (world2.containsValue(entry.getValue())) {
                        if (entry.getValue().equals(entry4.getValue())) {
                            counter1++;
                        }
                    }
                    key3++;
                }
            }
                if (counter != counter1) {
                    result = false;
                }

        }
        return result;
    }
}

