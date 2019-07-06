package ru.job4j.search;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

import static org.hamcrest.core.Is.is;


public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                     Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                 3);
        int[][] expect = {
                         {1, 2, 3},
                         {4, 5, 6},
                         {7, 0 ,0}
        };
    }


}