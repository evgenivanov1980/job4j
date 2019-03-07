package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest  {
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenSubtractOneMinusOneThenNull() {
        Calculator calc = new Calculator();
        double result = calc.subtract(2, 1);
        double expected = 1;
        assertThat(result, is(expected));
    }
    @Test
    public void whenDivFourDividedTwoThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.div(4, 2);
        double expected = 2;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMultipleTwoUmnogitTwoThenFour() {
        Calculator calc = new Calculator();
        double result = calc.multiple(2, 2);
        double expected = 4;
        assertThat(result, is(expected));
    }
}
