package ru.job4j.TrackerSingleton;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


public class TrackerSingleton1Test {
    @Test
    public void whenCreatObjectSingletonThenHeOnlyOne() {
        TrackerSingleton1 tracker1 = TrackerSingleton1.INSTANCE;
        TrackerSingleton1 tracker2 = TrackerSingleton1.INSTANCE;
        assertThat(tracker1, is(tracker2));

    }


}