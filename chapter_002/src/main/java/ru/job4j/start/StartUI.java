package ru.job4j.start;

import ru.job4j.models.Task;
import ru.job4j.models.*;

public class StartUI {

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        tracker.add(new Task("first name", "desk"));
        for (Item var : tracker.getAll()) {
            System.out.println(var.getName());



        }



    }
}
