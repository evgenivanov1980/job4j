package ru.job4j.usersort;

import java.util.ArrayList;
import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        char[] left_char = left.toCharArray();
        char[] right_char = right.toCharArray();
        result = Integer.compare(left.length(), right.length());
        if (result == 0) {
            for (int i = 0; i < left_char.length; i++) {
                result = Character.compare(left_char[i], right_char[i]);
                if (result != 0) {
                    break;
                }


            }
        }
        return result;
    }
}
