package ru.job4j.loop;

public class Board {
    public String paint(int width, int weight) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i <= width; i++) {
            for (int j = 0; j <= weight; j++) {
                if (i + j % 2 == 0) {
                    screen.append("X");
                }
                else {
                    screen.append("0");
                }
            }
        }
            screen.append(ln);
        return toString();

    }
}
