package ru.job4j.trackersingleton;

/**
 * Последний вариант объект класса находиться в поле внутреннего класса.
 */

public class TrackerSingletonFour {

    private TrackerSingletonFour() {

    }

    public static TrackerSingletonFour getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final TrackerSingletonFour INSTANCE = new TrackerSingletonFour();
    }




}
