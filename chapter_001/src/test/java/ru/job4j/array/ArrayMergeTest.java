package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayMergeTest {
    @Test
    public void whenTwoArraysThenThirtySorted() {
        ArrayMerge integration = new ArrayMerge();
        int[] input = integration.merge(new int[]{21, 23, 24, 40, 75}, new int[]{10, 11, 41, 50, 65});
        int[] expect = new int[] {10, 11, 21, 23, 24, 40, 41, 50, 65, 75};
        assertThat(input, is(expect));
    }


}