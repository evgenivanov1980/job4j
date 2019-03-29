package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class BubbleSortTest {
    @Test
    public void whenArrayNotSortedThenSorting() {
        BubbleSort bubbles = new BubbleSort();
        int[] result = bubbles.sort(new int[]{9, 1, 4, 7, 5});
        int[] expect = new int[]{1, 4, 5, 7, 9};
        assertThat(result, is(expect));

    }
}



