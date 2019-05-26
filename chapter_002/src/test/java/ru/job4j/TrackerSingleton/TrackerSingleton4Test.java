package ru.job4j.TrackerSingleton;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TrackerSingleton4Test {
    @Test
    public void whenCreatingObjectSingleton4ThenHeOnlyOne() {
        TrackerSingleton4 tracker1 = TrackerSingleton4.getInstance();
        TrackerSingleton4 tracker2 = TrackerSingleton4.getInstance();
        assertThat(tracker1, is(tracker2));
    }

}