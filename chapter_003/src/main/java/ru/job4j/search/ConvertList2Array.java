package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (int) Math.ceil((double) list.size() / rows);
        int[][] array = new int[rows][cells];
        int r = 0;
        int c = 0;
        for (Integer list2 : list) {
            array[r][c] = list2;
            c++;
            if (c == cells) {
                r++;
                c = 0;



            }





        }


        return array;
    }

    public List<Integer> convert(List<int[]> list) {
        List<Integer> roster = new ArrayList<>();
        for (int[] roll : list) {
            for (int element : roll) {
                roster.add(element);
            }

        }
        return roster;
    }
}


