package ru.job4j.trackerSingleton;

import org.junit.Test;

public class TrackerSingleton2Test {

    @Test
    public void whenCreatingObjectSingleton2ThenHeOnlyOne() {
        TrackerSingleton2 tracker1 = TrackerSingleton2.getInstance();
        TrackerSingleton2 tracker2 = TrackerSingleton2.getInstance();
        if (tracker1 == tracker2) {
            System.out.println("Один");
        }


    }

}



