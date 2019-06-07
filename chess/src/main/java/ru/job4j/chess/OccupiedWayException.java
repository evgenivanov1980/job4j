package ru.job4j.chess;

import ru.job4j.chess.Logic;

public class OccupiedWayException extends Exception {

    OccupiedWayException(String msg) {
        super(msg);
    }


}
