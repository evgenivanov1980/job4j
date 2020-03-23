package ru.job4j.trackersingleton;

import org.junit.Test;

public class TrackerSingletonFourTest {
    @Test
    public void whenCreatingTwoObjectsSingleton4ThenHeOnlyOne() {
        TrackerSingletonFour tracker1 = TrackerSingletonFour.getInstance();
        TrackerSingletonFour tracker2 = TrackerSingletonFour.getInstance();
        if (tracker1 == tracker2) {
            System.out.println("У нас только один объект Singleton");
        }
    }

}