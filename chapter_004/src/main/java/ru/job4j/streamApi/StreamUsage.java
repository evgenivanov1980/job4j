package ru.job4j.streamApi;

import javafx.concurrent.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> task = Arrays.asList(5, -2, 23, 4, -8, 21, -96, 54, 7);
        List<Integer> result = task.stream().filter(n -> n > 0).collect(Collectors.toList());
        System.out.println(result);
    }
}
