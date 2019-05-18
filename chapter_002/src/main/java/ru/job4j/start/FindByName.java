package ru.job4j.start;
import ru.job4j.models.*;

import java.util.Arrays;

public class FindByName implements UserAction {
    @Override
    public int key() {
        return 5;
    }
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("----Поиск заявки по имени----");
        String name = input.ask("Введите имя заявки");
        Item[] item = tracker.findByName(name);
        System.out.println("Найденная заявка:" + Arrays.toString(item));

    }
    @Override
    public String info() {
        return "Найти заявку по имени";
    }


}
