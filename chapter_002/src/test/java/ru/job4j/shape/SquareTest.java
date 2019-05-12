package ru.job4j.shape;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author Evgeny Ivanov
 * @version $Id$
 * @since 0.1
 */

public class SquareTest {
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(
                        new StringBuilder()
                        .append("+++++++" + System.lineSeparator())
                        .append("+++++++" + System.lineSeparator())
                        .append("+++++++" + System.lineSeparator())
                        .append("+++++++" + System.lineSeparator())
                        .toString()
                )
        );
    }



}