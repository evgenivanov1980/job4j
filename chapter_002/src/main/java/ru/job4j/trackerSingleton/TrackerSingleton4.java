package ru.job4j.trackerSingleton;

/**
 * Последний вариант объект класса находиться в поле внутреннего класса.
 */

public class TrackerSingleton4 {

    private TrackerSingleton4() {

    }

    public static TrackerSingleton4 getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final TrackerSingleton4 INSTANCE = new TrackerSingleton4();
    }




}
