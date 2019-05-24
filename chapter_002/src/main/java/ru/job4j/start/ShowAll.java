package ru.job4j.start;

        import ru.job4j.models.*;

public class ShowAll extends BaseAction {

    public ShowAll(int key, String name) {
        super(key, name);
    }


    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------Отображение всех заявок------");
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }

    }

}
