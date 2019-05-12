package ru.job4j.shape;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 * @author Evgeny Ivanov
 * @version $Id$
 * @since 0.1
 */

public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(), is(
                        new StringBuilder()
                        .append("    +   " + System.lineSeparator())
                        .append("  ++++  " + System.lineSeparator())
                        .append("++++++++" + System.lineSeparator())
                        .toString()


                )
        );
    }



}