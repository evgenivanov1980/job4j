package ru.job4j.ttrackerSingleton;

import org.junit.Test;

import static org.junit.Assert.*;

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



