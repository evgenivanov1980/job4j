package ru.job4j.start;
import ru.job4j.models.*;

public class FindById implements UserAction {
    @Override
    public int key() {
        return 4;
    }
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("-----Поиск заявки по id-----");
        String id = input.ask("Введите id заявки");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Найденная заявка" + item);
        }
        else {
            System.out.println("---- Заявка с таким id не найдена -----");
        }
    }
    @Override
    public String info() {
        return "Найти заявку по id";
    }

}
