package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.StringJoiner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Evgeny Ivanov;
 * @version $Id$;
 * @since 01
 */

public class PaintTest {
    @Test
    public void whenPiramid4Right() {
        Paint paint = new Paint();
        String rst = paint.rightTr1(4);
        System.out.println(rst);
        assertThat(rst,
                is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("^   ")
                        .add("^^  ")
                        .add("^^^ ")
                        .add("^^^^")
                        .toString()
                )
        );
    }

    @Test
    public void whenPiramid4Left() {
        Paint paint = new Paint();
        String rst = paint.leftTr1(4);
        System.out.println(rst);
        assertThat(rst,
                is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("   ^")
                        .add("  ^^")
                        .add(" ^^^")
                        .add("^^^^")
                        .toString()
                )
        );
    }
}