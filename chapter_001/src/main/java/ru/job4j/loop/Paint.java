package ru.job4j.loop;

/**
 * @author Evgeny Ivanov
 * @version $1d$
 * @since 01
 */

public class Paint {
    public String rightTr1(int height) {
        StringBuilder screen = new StringBuilder();  // буфер для результата
        int width = height;
        for (int row = 0; row != height; row++) {    // внешний цикл двигается по строкам
            for (int column = 0; column != width; column++) {   // внутренний цикл определяет индекс ячейки в строке
                if (row >= column) {  // если индекс ячейки в строке меньше или равен положению ячейки по высоте, рисуем галку
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    public String leftTr1(int height) {
        StringBuilder screen = new StringBuilder();
        int width = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= width - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    public String pyramyd(int height) {
        StringBuilder screen = new StringBuilder();
        int width = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
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





