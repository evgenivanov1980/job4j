import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class CoffeemashineTest {
    @Test
    public void whenChanges15() {
        Coffeemashine coffeemashine = new Coffeemashine();
        int[] result = coffeemashine.changes(101, 50);
        int[] expect = new int[] {10, 1};
        assertThat(result, is(expect));
    }

}