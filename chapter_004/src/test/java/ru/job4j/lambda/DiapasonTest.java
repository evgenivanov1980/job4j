package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import java.util.function.Function;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;


public class DiapasonTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        Diapason function = new Diapason();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResult() {
        Diapason function = new Diapason();
        List<Double> result = function.diapason(1, 3, x -> 2 * (x * x) + 2 * x + 1);
        List<Double> expected = Arrays.asList(5D, 13D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenDemonstrativeFunctionThenDemonstrativeResult() {
        Diapason function = new Diapason();
        List<Double> result = function.diapason(1, 3, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(2D, 4D);
        assertThat(result, is(expected));
    }



}