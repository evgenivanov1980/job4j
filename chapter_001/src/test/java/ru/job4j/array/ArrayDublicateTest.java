package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ArrayDublicateTest {
    @Test
    public void whenRemoveDublicatesThenArrayWithoutDublicate() {
        ArrayDublicate remove = new ArrayDublicate();
        String[] result = remove.remove(new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"});
        String[] expect = new String[] {"Привет", "Мир", "Супер"};
        assertThat(result, is(expect));


    }
    @Test
    public void whenRemoveDublicatesThenWithoutDublicate2() {
        ArrayDublicate remove = new ArrayDublicate();
        String[] result = remove.remove(new String[] {"На", "Дворе", "На", "Трава", "Ночь", "Дворе"});
        String[] expect = new String[] {"На", "Дворе", "Ночь", "Трава"};
        assertThat(result, is(expect));

    }



}