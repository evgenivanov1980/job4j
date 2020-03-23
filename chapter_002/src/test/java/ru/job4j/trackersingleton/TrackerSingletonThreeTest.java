package ru.job4j.trackersingleton;

import org.junit.Test;

public class TrackerSingletonThreeTest {
    @Test
    public void whenCreatingObjectSingleton3ThenHeOnlyOne() {
        TrackerSingletonThree tracker1 = TrackerSingletonThree.getInstance();
        TrackerSingletonThree tracker2 = TrackerSingletonThree.getInstance();
        if (tracker1 == tracker2) {
            System.out.println("У нас только один объект Singleton");
        }
    }

}