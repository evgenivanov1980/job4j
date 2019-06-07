package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class BishopBlackTest {
    @Test
    public void whenMoveBishopThenHasHisWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell[] result = bishopBlack.way(Cell.C8, Cell.F5);
        Cell[] expect = new Cell[] {Cell.D7, Cell.E6, Cell.F5};
        assertThat(result, is(expect));


    }

}