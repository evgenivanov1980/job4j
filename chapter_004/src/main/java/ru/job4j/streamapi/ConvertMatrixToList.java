package ru.job4j.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertMatrixToList {
    public List<Integer> flatMapExample(int[][] arr) {
        return Stream.of(arr).flatMapToInt(Arrays::stream).boxed().collect(Collectors.toList());

    }
}
