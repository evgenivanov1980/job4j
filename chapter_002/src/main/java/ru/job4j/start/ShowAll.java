package ru.job4j.start;

import ru.job4j.models.*;

public class ShowAll implements UserAction {
    @Override
    public int key() {
        return 1;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------Отображение всех заявок------");
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }

    }
    @Override
    public String info() {
        return "Отобразить все заявки";
    }
}
