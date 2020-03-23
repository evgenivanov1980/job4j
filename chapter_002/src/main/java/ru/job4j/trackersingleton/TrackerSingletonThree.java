package ru.job4j.trackersingleton;

/**
 * Энергичная загрузка (Eager loading) - загружает объект сразу после старта виртуальной машины.
 */

public class TrackerSingletonThree {
    private static final TrackerSingletonThree INSTANCE = new TrackerSingletonThree();

    private TrackerSingletonThree() {

    }

    public static TrackerSingletonThree getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        TrackerSingletonThree tracker = TrackerSingletonThree.INSTANCE;
    }
}
