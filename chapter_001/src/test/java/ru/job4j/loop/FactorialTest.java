package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenFactorialForFiveThenOneHandTwenty() {

        /**
         * Проверка вычисления факториала для n= 5
         */
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        assertThat(result, is(120));

    }


    @Test
    public void whenFactorialForZeroThenOne() {

        /**
         * Проверка вычисления факториала для n= 0
         */
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        assertThat(result, is(1));
    }
}