package ru.job4j.TrackerSingleton;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TrackerSingleton2Test {
    @Test
    public void whenCreatingObjectSingleton2ThenHeOnlyOne() {
        TrackerSingleton2 tracker1 = TrackerSingleton2.getInstance();
        TrackerSingleton2 tracker2 = TrackerSingleton2.getInstance();
        assertThat(tracker1, is(tracker2));
    }

}