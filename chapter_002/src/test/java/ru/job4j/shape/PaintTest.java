package ru.job4j.shape;

import org.junit.Test;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import org.junit.After;
import org.junit.Before;

/**
 * @autor Evgeny Ivanov
 * @version $Id$
 * @since 0.1
 */

public class PaintTest {
    private final PrintStream stdout = System.out;  // поле содержит дефолтный вывод в консоль
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();  // буфер для результата
    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }
    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }
    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square()); // выполняем действия пишущие в консоль
        // проверяем результат вычисления
        assertThat(
                new String(out.toByteArray()),
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
    @Test
    public void whenTriangle() {

        new Paint().draw(new Triangle());  // выполняем действия пишущие в консоль
        // проверяем результат вычисления
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                        .append("    +   " + System.lineSeparator())
                        .append("  ++++  " + System.lineSeparator())
                        .append("++++++++" + System.lineSeparator())
                        .toString()
                )
        );

    }

}