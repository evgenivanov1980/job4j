package ru.job4j.usersort;

import java.util.ArrayList;
import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int  result = Integer.compare(left.length(), right.length());
        if (result == 0) {
            for (int i = 0; i < left.length(); i++) {
                result = Character.compare(left.charAt(i), right.charAt(i) );
                if (result != 0) {
                    break;
                }


            }
        }
        return result;
    }
}
