package ru.job4j.start;

import ru.job4j.models.Task;
import ru.job4j.models.*;

import java.util.Arrays;

/**
 * @version $ID$
 * @since 26.04.2019
 */

public class StartUI {


    /**
     * Получение данных от пользователя
     */

    private final Input input;

    /**
     * Хранилище заявок
     */

    private final Tracker tracker;

    /**
     * Конструктор инициализирующий поля
     *
     * @param input   ввод данных
     * @param tracker хранилище заявок
     */

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;

    }

    /**
     * Основной цикл программы
     */

    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        do {
            menu.show();
            menu.select(Integer.valueOf(input.ask("select:")));
        }
        while (!"y".equals(this.input.ask("Exit?(y):")));


    }


    /**
     * Запуск программы
     *
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }

}
