package ru.job4j.start;

import ru.job4j.models.*;
import ru.job4j.start.*;

public class UpdateItem implements UserAction {
    @Override
    public int key() {
        return 2;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------Редактирование заявки------");
        String id = input.ask("Введите id заявки");
        String name = input.ask("Введите новое имя заявки");
        String desc = input.ask("Введите новое описание заявки");
        Item item = new Item(name, desc);
        if (tracker.replace(id, item)) {
            System.out.println("------Новая заявка с id:" + item.getId());
        } else {
            System.out.println("----Заявка не найдена----");
        }

    }

    @Override
    public String info() {
        return "Редактировать заявку";
    }
}
