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
     * Константа меню для добавления новой заявки
     */

    private static final String ADD = "0";

    /**
     * Константа меню для отоброжения всех заявок
     */

    private static final String SHOW = "1";

    /**
     * Константа меню для редактирования заявки
     */

    private static final String EDIT = "2";

    /**
     * Константа меню для удаления заявки
     */

    private static final String DELETE = "3";

    /**
     * Константа меню ддя нахождения заявки по id
     */

    private static final String FINDID = "4";

    /**
     * Константа меню для нахождения заявки по имени
     */

    private static final String FINDNAME = "5";

    /**
     * Константа  для выхода из меню
     */

    private static final String EXIT = "6";

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
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню");
            if (ADD.equals(answer)) {
                this.createItem();

            } else if (SHOW.equals(answer)) {
                this.showAllItems();
            } else if (EDIT.equals(answer)) {
                this.editItem();

            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FINDID.equals(answer)) {
                this.findItemById();
            } else if (FINDNAME.equals(answer)) {
                this.findItemByName();
            } else if (EXIT.equals(answer)) {
                break;
            }


        }


    }

    /**
     * Метод добавления новой заявки в хранилище
     */
    public void createItem() {
        System.out.println("--------Добавление новой заявки-------");
        String name = this.input.ask("Введите имя заявки:");
        String desc = this.input.ask("Введите описание заявки:");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("--------Новая заявка с id: " + item.getId() + "-------");


    }

    /**
     * Метод отображения всех заявок
     */
    public void showAllItems() {
        System.out.println("------ Отображение всех заявок------");
        Item[] items = this.tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    /**
     * Метод редактирования заявки
     */

    public void editItem() {
        System.out.println("-------Редактироваание заявки-------");
        String id = this.input.ask("Введите id заявки");
        String changedname = this.input.ask("Введите новое имя заявки ");
        String changeddescription = this.input.ask("Введите новое описание");
        Item item = new Item(changedname, changeddescription);
        if (this.tracker.replace(id, item)) {
            System.out.println("------ Новая заявка с id:" + item.getId() + "------");
        } else System.out.println("------ Заявка не найдена -----");


    }

    /**
     * Метод удаления заявки
     */
    public void deleteItem() {
        System.out.println("-------Удаление заявки------");
        String id = this.input.ask("Введите id заявки");
        if (this.tracker.delete(id)) {
            System.out.println("---- Удаление заявки прошло успешно ----");
        }
        System.out.println("----- Заявка с таким id не найдена");


    }

    /**
     * Метод поиска заявки по id
     */
    public void findItemById() {
        System.out.println("----- Поиск заявки по id-----");
        String id = this.input.ask("Введите id заявки");
        Item item = this.tracker.findById(id);
        if (item != null) {
            System.out.println("Найденная заявка" + item + "--");
        }
        System.out.println("---- Заявка с таким id не найдена -----");
    }

        /**
         * Метод поиска заявки по имени
         */
        public void findItemByName () {
            System.out.println("----Поиск заявки по имени----");
            String name = this.input.ask("Введите имя заявки");
            Item[] item = this.tracker.findByName(name);
            System.out.println("Найденная заявка" + Arrays.toString(item) + "---");

        }


        private void showMenu () {
            System.out.println("Меню");
            System.out.println("Добавить новую заявку");
            System.out.println("Показать все заявки");
            System.out.println("Редактировать зявку");
            System.out.println("Удалить заявку");
            System.out.println("Найти заявку по id");
            System.out.println("Найти заявку по имени");
            System.out.println("Выход из программы");
        }

        /**
         * Запуск программы
         *
         * @param args
         */

        public static void main (String[]args){
            new StartUI(new ConsoleInput(), new Tracker()).init();
        }

    }
