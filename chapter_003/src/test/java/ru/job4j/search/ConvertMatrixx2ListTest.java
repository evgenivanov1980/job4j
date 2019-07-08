package ru.job4j.search;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ConvertMatrixx2ListTest {
    @Test
    public void when2on2ArrayThenList4() {
        ConvertMatrixx2List list = new ConvertMatrixx2List();
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        List<Integer> expect = Arrays.asList(1, 2, 3, 4);
        List<Integer> result = list.tolist(input);
        assertThat(result, is(expect));
    }

}