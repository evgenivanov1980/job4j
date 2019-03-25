package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 2};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));

    }
    @Test
    public void whenArrayNoElement() {
        FindLoop notfind = new FindLoop();
        int[] input = new int[] {4, 9, 16};
        int value = 6;
        int expect = -1;
        int result = notfind.indexOf(input, value);
        assertThat(result, is(expect));
    }


}