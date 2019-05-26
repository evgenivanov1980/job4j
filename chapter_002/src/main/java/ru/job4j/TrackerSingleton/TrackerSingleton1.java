package ru.job4j.TrackerSingleton;



import ru.job4j.models.Item;

import java.util.Arrays;

public enum  TrackerSingleton1 {
    INSTANCE;





    public Item add(Item item) {
        return item;
    }

    public boolean replace(String id, Item item) {
        return replace(id, item);
    }

    public boolean delete(String id) {
        return delete(id);
    }

    public Item[] findall() {
        return findall();
    }

    public static void main(String[] args) {
        TrackerSingleton1 tracker = TrackerSingleton1.INSTANCE;


    }


}
