package ru.job4j.shape;

import org.junit.Test;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;

/**
 * @autor Evgeny Ivanov
 * @version $Id$
 * @since 0.1
 */

public class PaintTest {
    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out; // получаем ссылку на стандартный вывод в консоль
        ByteArrayOutputStream out = new ByteArrayOutputStream(); // создаем буфер для хранения вывода
        System.setOut(new PrintStream(out)); // заменяем стандартный вывод на вывод в память для тестирования
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
        System.setOut(stdout); // возвращаем обратно стандартный вывод в консоль
    }
    @Test
    public void whenTriangle() {
        PrintStream stdout = System.out; // получаем  ссылку на стандартный вывод в консоль
        ByteArrayOutputStream out = new ByteArrayOutputStream(); // создаем буфер для хранения вывода
        System.setOut(new PrintStream(out)); // заменям стандартный вывод на вывод в память для тестирования
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
        System.setOut(stdout); // возвращаем обратно стандартный вывод в консоль
    }

}