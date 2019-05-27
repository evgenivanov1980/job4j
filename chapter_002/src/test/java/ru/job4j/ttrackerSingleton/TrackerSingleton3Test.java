package ru.job4j.ttrackerSingleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerSingleton3Test {
    @Test
    public void whenCreatingObjectSingleton3ThenHeOnlyOne() {
        TrackerSingleton3 tracker1 = TrackerSingleton3.getInstance();
        TrackerSingleton3 tracker2 = TrackerSingleton3.getInstance();
        if (tracker1 == tracker2) {
            System.out.println("У нас только один объект Singleton");
        }
    }

}