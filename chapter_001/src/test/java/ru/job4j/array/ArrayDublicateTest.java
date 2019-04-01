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


}