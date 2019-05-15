package ru.job4j.start;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.models.Item;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

public class StartUITest {
    private final Tracker tracker = new Tracker();
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    /**
     * Перенос строки
     */
    private final String ln = System.lineSeparator();
    private final String menu = this.showMenu();
    private final String showMenu() {
        StringBuilder menu = new StringBuilder();
                menu.append("\r");
                menu.append ("Меню\r");
                menu.append("Добавить новую заявку\r");
                menu.append("Показать все заявки\r");
                menu.append("Редактировать заявку\r");
                menu.append("Удалить заявку\r");
                menu.append("Найти заявку по id\r");
                menu.append("Найти заявку по имени\r");
                menu.append("Выход из программы\r");

        return menu.toString();

    }



    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(stdout);
    }


    @Test
    public void whenuserEnterShowAllItemsThenOutAllItems() {
        Item one = this.tracker.add(new Item("testname1", "testdesc1"));
        Item two = this.tracker.add(new Item("testname2", "testdesc2"));
        Input input = new StubInput(new String[]{"1", "6"});
        String showalls = "------Отображение всех заявок------";
        assertThat(new String(out.toByteArray()), is(String.format("%s\r%s\r-testname1, testdesk1\r%s", menu, showalls, one.getName(), one.getDescription(), menu)));

    }


    @Test
    public void WhenUserAddItemThenTrackerHasNewItemWithSomeName() {
        Input input = new StubInput(new String[]{"0", "testname", "testdesc", "6"}); // создаем Stubinput с последовательностью действий
        new StartUI(input, this.tracker).init(); // создаем startUI и вызываем метод init
        assertThat(tracker.getAll()[0].getName(), is("testname"));


    }

    @Test
    public void whenUpdateYhenTrackerHasUpdateValue() {
        Tracker tracker = new Tracker(); // создаем объект трекер
        Item item = tracker.add(new Item("testname", "testdescription")); // напрямую добавляем заявку
        Input input = new StubInput(new String[]{"2", item.getId(), "testreplace", "replaceitem", "6"}); //создаем staubInput с последовательностью действий (производим замену заявки)
        new StartUI(input, tracker).init(); // создаем  startUI и вызываем метод init
        assertThat(tracker.findById(item.getId()).getName(), is("testreplace"));

    }

    @Test
    public void whenDeleteItemThenTrackerHasUpdateValue() {
        Tracker tracker = new Tracker();  // создаем объект тркер
        Item one = tracker.add(new Item("testname1", "testdescription1")); // напряму добавляем первую заявку
        Item two = tracker.add(new Item("testname2", "testdescription2")); // добавляем вторую заявку
        Input input = new StubInput(new String[]{"3", one.getId(), "6"});  // создаем stubInput c последовательностью дейсвий (производим удление заявки)
        new StartUI(input, tracker).init();  //создаем startUI и вызываем метод init
        Item[] result = tracker.findAll();
        assertThat(result[0].getName(), is("testname2"));

    }

    @Test
    public void whenFindItemByIdThenWeHaveFoundItem() {
        Tracker tracker = new Tracker(); // создаем объект трекер
        Item one = tracker.add(new Item("testname1", "testdescription1")); // напрямую добавляем первую заявку
        Item two = tracker.add(new Item("testname2", "testdescription2")); // добавляем вторую заявку
        Input input = new StubInput(new String[]{"4", one.getId(), "6"}); // создаем stubInput с последовательностью действий (производим поиск заявки по id)
        new StartUI(input, tracker).init(); // создаем startUI и вызываем метод init
        assertThat(tracker.findAll()[0].getName(), is("testname1"));


    }

    @Test
    public void whenFindItemByNameThenWeHaveFoundItem() {
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("testname1", "testdescription1"));
        Item two = tracker.add(new Item("testname2", "testdescription2"));
        Input input = new StubInput(new String[]{"5", two.getName(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[1].getName(), is("testname2"));
    }
}