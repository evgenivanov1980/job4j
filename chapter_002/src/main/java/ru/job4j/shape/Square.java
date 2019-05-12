package ru.job4j.shape;

/**
 * @author Evgeny Ivanov
 * @version $Id$
 * @since 01
 */

public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("+++++++" + System.lineSeparator());
        pic.append("+++++++" + System.lineSeparator());
        pic.append("+++++++" + System.lineSeparator());
        pic.append("+++++++" + System.lineSeparator());
        return pic.toString();

    }

}
