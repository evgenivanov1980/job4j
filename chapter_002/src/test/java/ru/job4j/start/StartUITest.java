package ru.job4j.start;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.models.Item;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringJoiner;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;


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
        menu.append("Добавить новую заявку").append(ln);
        menu.append("Показать все заявки").append(ln);
        menu.append("Редактировать заявку").append(ln);
        menu.append("Удалить заявку").append(ln);
        menu.append("Найти заявку по id").append(ln);
        menu.append("Найти заявку по имени").append(ln);


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
        Input input = new StubInput(new String[]{"1", "y"});
        new StartUI(input, tracker).init();
        StringBuilder showalls = new StringBuilder(menu);
        showalls.append("------Отображение всех заявок------").append(ln);
        showalls.append(one).append(ln);
        showalls.append(two).append(ln);

        assertThat(new String(out.toByteArray()), is(showalls.toString()));


    }


    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSomeName() {
        Input input = new StubInput(new String[]{"0", "testname", "testdesc", "y"}); // создаем Stubinput с последовательностью действий
        new StartUI(input, this.tracker).init(); // создаем startUI и вызываем метод init
        assertThat(tracker.getAll()[0].getName(), is("testname"));


    }

    @Test
    public void whenUpdateYhenTrackerHasUpdateValue() {
        Item item = tracker.add(new Item("testname", "testdescription")); // напрямую добавляем заявку
        Input input = new StubInput(new String[]{"2", item.getId(), "testreplace", "replaceitem", "y"}); //создаем staubInput с последовательностью действий (производим замену заявки)
        new StartUI(input, tracker).init(); // создаем  startUI и вызываем метод init
        assertThat(tracker.findById(item.getId()).getName(), is("testreplace"));

    }

    @Test
    public void whenDeleteItemThenTrackerHasUpdateValue() {
        Item one = tracker.add(new Item("testname1", "testdescription1")); // напряму добавляем первую заявку
        Item two = tracker.add(new Item("testname2", "testdescription2")); // добавляем вторую заявку
        Input input = new StubInput(new String[]{"3", one.getId(), "y"});  // создаем stubInput c последовательностью дейсвий (производим удление заявки)
        new StartUI(input, tracker).init();  //создаем startUI и вызываем метод init
        Item[] result = tracker.findAll();
        assertThat(result[0].getName(), is("testname2"));

    }

    @Test
    public void whenFindItemByIdThenWeHaveFoundItem() {
        Item one = tracker.add(new Item("testname1", "testdescription1")); // напрямую добавляем первую заявку
        Item two = tracker.add(new Item("testname2", "testdescription2")); // добавляем вторую заявку
        Input input = new StubInput(new String[]{"4", two.getId(), "y"}); // создаем stubInput с последовательностью действий (производим поиск заявки по id)
        new StartUI(input, tracker).init(); // создаем startUI и вызываем метод init
        StringBuilder showitembyid = new StringBuilder(menu);
        showitembyid.append("-----Поиск заявки по id-----").append(ln);
        showitembyid.append("Найденная заявка");
        showitembyid.append(two).append(ln);
        assertThat(new String(out.toByteArray()), is(showitembyid.toString()));


    }

    @Test
    public void whenFindItemByNameThenWeHaveFoundItem() {
        Item one = tracker.add(new Item("testname1", "testdescription1"));
        Item two = tracker.add(new Item("testname2", "testdescription2"));
        Input input = new StubInput(new String[]{"5", two.getName(), "y"});
        new StartUI(input, tracker).init();
        StringBuilder showitemsbynames = new StringBuilder(menu);
        showitemsbynames.append("----Поиск заявки по имени----").append(ln);
        showitemsbynames.append("Найденная заявка:");
        showitemsbynames.append(Arrays.toString(new Item[]{two})).append(ln);
        assertThat(new String(out.toByteArray()), is(showitemsbynames.toString()));

    }
}