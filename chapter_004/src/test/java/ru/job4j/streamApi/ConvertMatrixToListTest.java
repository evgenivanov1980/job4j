package ru.job4j.streamApi;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import java.util.List;

public class ConvertMatrixToListTest {
    @Test
    public void whenArrayThenList() {
        ConvertMatrixToList matrix = new ConvertMatrixToList();
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        List<Integer> result = matrix.flatMapExample(arr);
        List<Integer> expect = List.of(1, 2, 3 ,4, 5, 6);
        assertThat(result, is(expect));

    }

}