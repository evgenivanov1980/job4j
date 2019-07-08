package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrixx2List {
    public List<Integer> tolist(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] array1 : array) {
            for (int element : array1 ) {
                list.add(element);
            }

        }
        return list;
    }

}



