package ru.job4j.trackersingleton;

/**
 * Ленивая згрузка происходит, когда мы явно обращаемся к объекту. Происходит его загрузка.
 */

public class TrackerSingletonTwo {

    private static TrackerSingletonTwo instance;

    private TrackerSingletonTwo() {

    }

    public static TrackerSingletonTwo getInstance() {
        if (instance == null) {
            instance = new TrackerSingletonTwo();
        }
        return instance;
    }



}
