package ru.job4j.trackerSingleton;

import org.junit.Test;

public class TrackerSingletonOneTest {
    @Test
    public void whenCreateTwoObjectTrackerSingleton1ThenHeOnlyOne() {
        TrackerSingletonOne tracker = TrackerSingletonOne.INSTANCE;
        TrackerSingletonOne tracker2 = TrackerSingletonOne.INSTANCE;
        if (tracker == tracker2) {
            System.out.println("У нас только один объект Singleton");
        }
    }
}