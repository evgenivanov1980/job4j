package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * @author Evgeny Ivanov
 * @version $1d$
 * @since 01
 */

public class Paint {
    public String rightTr1(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );


    }

    public String leftTr1(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1

        );


    }

    public String pyramyd(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column

        );
    }

    private String loopBy(int height, int width, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    public static void main(String[] args) {
        Paint paint = new Paint();
        System.out.println(paint.pyramyd(4));

    }
}





