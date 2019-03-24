package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst =  new int[bound];
        for (int index = 0; index != bound; index++) {
            rst[index] = (index + 1);
            rst[index] = rst[index] * rst[index];

        }
        return rst;

    }
}
