package ru.job4j.usersort;

import java.util.ArrayList;
import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {

        int result = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.length() == right.length()) {
                if (left.charAt(i) == right.charAt(i)) {
                    result = 0;
                    continue;

                } else if (left.charAt(i) > right.charAt(i)) {
                    result = 1;
                    break;
                } else if (left.charAt(i) < right.charAt(i)) {
                    result = -1;
                    break;
                }
            }
            result = left.length() > right.length() ? 1 : -1;


        }
        return result;
    }
}
