package ru.job4j.chess;

public class FiguraNotFoundException extends RuntimeException {

    FiguraNotFoundException(String msg) {
        super(msg);
    }
}
