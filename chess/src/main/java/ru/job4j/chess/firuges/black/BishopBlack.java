package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        int deltaX = dest.x - source.x;
        int deltaY = dest.y - source.y;
        Cell[] steps = new Cell[Math.abs(deltaX)];

        if (Math.abs(deltaX) != Math.abs(deltaY)) {
            throw new ImpossibleMoveException("Фигура так не ходит");


        }


        int kX = deltaX / Math.abs(deltaX);
        int ky = deltaY / Math.abs(deltaY);

        for (int index = 0; index < Math.abs(deltaX); index++) {
            steps[index] = Cell.coordinates(source.x + kX * (index + 1), source.y + ky * (index + 1));


        }

        return steps;
    }


    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
