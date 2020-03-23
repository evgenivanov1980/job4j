package ru.job4j.trackerSingleton;

/**
 * Энергичная загрузка (Eager loading) - загружает объект сразу после старта виртуальной машины.
 */

public class TrackerSingleton3 {
    private static final TrackerSingleton3 INSTANCE = new TrackerSingleton3();

    private TrackerSingleton3() {

    }

    public static TrackerSingleton3 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        TrackerSingleton3 tracker = TrackerSingleton3.INSTANCE;
    }
}
