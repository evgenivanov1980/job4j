package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] date, int e1) {
        int rst = -1;
        for (int index = 0; index < date.length; index++) {
            if (date[index] == e1) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}



