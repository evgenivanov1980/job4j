package ru.job4j.ttrackerSingleton;

import org.junit.Test;

public class TrackerSingleton1Test {
    @Test
    public void whenCreateTwoObjectTrackerSingleton1ThenHeOnlyOne() {
        TrackerSingleton1 tracker = TrackerSingleton1.INSTANCE;
        TrackerSingleton1 tracker2 = TrackerSingleton1.INSTANCE;
        if (tracker == tracker2) {
            System.out.println("У нас только один объект Singleton");
        }
    }
}