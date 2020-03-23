package ru.job4j.trackersingleton;

import org.junit.Test;

public class TrackerSingletonTwoTest {

    @Test
    public void whenCreatingObjectSingleton2ThenHeOnlyOne() {
        TrackerSingletonTwo tracker1 = TrackerSingletonTwo.getInstance();
        TrackerSingletonTwo tracker2 = TrackerSingletonTwo.getInstance();
        if (tracker1 == tracker2) {
            System.out.println("Один");
        }


    }

}



