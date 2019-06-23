import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class CoffeemashineTest {
    @Test
    public void whenChanges35() {
        Coffeemashine coffeemashine = new Coffeemashine();
        int[] result = coffeemashine.changes(50, 15);
        int[] expect = new int[] {10, 10, 10, 5};
        assertThat(result, is(expect));
    }

    @Test
     public void whenChanges43() {
        Coffeemashine coffeemashine = new Coffeemashine();
        int[] result = coffeemashine.changes(63, 20);
        int[] expect = new int[] {10, 10, 10, 10, 2, 1};
        assertThat(result, is(expect));
    }

    @Test
    public void whenChanges6() {
        Coffeemashine coffeemashine = new Coffeemashine();
        int[] result = coffeemashine.changes(12, 6);
        int[] expect = new int[] {5, 1};
        assertThat(result, is(expect));
    }





}