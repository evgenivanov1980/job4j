package ru.job4j.TrackerSingleton;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TrackerSingleton3Test {
    @Test
    public void whenCreatingObjectSingleton3ThenHeOnlyOne() {
        TrackerSingleton3 tracker1 = TrackerSingleton3.getInstance();
        TrackerSingleton3 tracker2 = TrackerSingleton3.getInstance();
        assertThat(tracker1, is(tracker2));
    }

}