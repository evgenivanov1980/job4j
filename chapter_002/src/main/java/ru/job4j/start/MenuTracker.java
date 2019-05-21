package ru.job4j.start;

import java.util.ArrayList;

public class MenuTracker {
    /**
     * @param хранит ссылку на объект
     */
    private final Input input;

    /**
     * @param хранит ссылку на объект
     */
    private final Tracker tracker;

    /**
     * @param хранит ссылку на массив UserAction
     */
    private ArrayList<UserAction> actions = new ArrayList<>();
    /**
     * Конструктор
     * @param input объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    /**
     * Метод для получения массива меню
     *
     * @return длинну массива
     */
    public int getActionsLentgh() {
        return this.actions.size();
    }

    /**
     * Метод заполняет массив
     */
    public void fillActions() {
        this.actions.add(new AddItem());
        this.actions.add(new ShowAll());
        this.actions.add(new UpdateItem());
        this.actions.add(new DeleteItem());
        this.actions.add(new FindById());
        this.actions.add(new FindByName());


    }
    /**
     * Метод в зависимости от указанного ключа, выполняет соответствующее действие
     *
     * @param key ключ операции
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    /**
     * Метод выводит на экран меню
     */
    public void show() {
        for (UserAction action: this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

}

