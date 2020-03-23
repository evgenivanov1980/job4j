package ru.job4j.trackerSingleton;

import org.junit.Test;

public class TrackerSingleton4Test {
    @Test
    public void whenCreatingTwoObjectsSingleton4ThenHeOnlyOne() {
        TrackerSingleton4 tracker1 = TrackerSingleton4.getInstance();
        TrackerSingleton4 tracker2 = TrackerSingleton4.getInstance();
        if (tracker1 == tracker2) {
            System.out.println("У нас только один объект Singleton");
        }
    }

}