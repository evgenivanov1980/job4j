package ru.job4j.ttrackerSingleton;

import ru.job4j.start.Tracker;

/**
 * Ленивая згрузка происходит, когда мы явно обращаемся к объекту. Происходит его загрузка.
 */

public class TrackerSingleton2 {

    private static TrackerSingleton2 instance;

    private TrackerSingleton2() {

    }

    public static TrackerSingleton2 getInstance() {
        if (instance == null) {
            instance = new TrackerSingleton2();
        }
        return instance;
    }



}
