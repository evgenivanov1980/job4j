package ru.job4j.shape;

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("    +   " + System.lineSeparator());
        pic.append("  ++++  " + System.lineSeparator());
        pic.append("++++++++" + System.lineSeparator());

        return pic.toString();

    }
}
