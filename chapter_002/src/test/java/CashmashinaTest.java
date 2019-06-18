import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CashmashinaTest {
    @Test
    public void unchange() {
        Cashmashina machine = new Cashmashina(new int[] {1, 5, 10});
        int[] result = machine.exchange(1);
        assertThat(result, is(singletonList(singletonList(1))));
    }

    @Test
    public void five() {
        Cashmashina machine = new Cashmashina(new int[] {1, 5, 10});
        int[] result = machine.exchange(5);
        assertThat(result, is(
                asList(
                        asList(1, 1, 1, 1, 1),
                        asList(5)
                )
        ));
    }

    @Test
    public void change() {
        Cashmashina machine = new Cashmashina(new int[] {10, 5, 1});
        int[] result = machine.exchange(10);
        assertThat(
                result, is(
                        asList(
                                singletonList(10),
                                asList(5, 5),
                                asList(1, 1, 1, 1, 1, 5),
                                asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
                        )
                )
        );
    }

}