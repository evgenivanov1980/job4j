package ru.job4j.start;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.models.Item;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;


public class TrackerTest {
    @Test
    public void whenAddNewItemThenTreckerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testdescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));


    }

    @Test
    public void whenReplaceNameThenRetornNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testdescription", 123L);
        //Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        //Создаем новую заявку
        Item next = new Item("test2", "testDescription2", 1234L);
        //Проставляем старый id из previous, который был сгенерирован выше
        next.setId(previous.getId());
        //Обновляем заявку в трекере
        tracker.replace(previous.getId(), next);
        //Проверяем, что заявка с таким id имеет новое имя test2
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));



    }

    @Test
    public void whenDeleteIdThenReturnNewLength() {
        Tracker tracker = new Tracker();
        Item one = new Item("test1", "testdescription1", 123L);
        Item two = new Item("test2", "testdescription2", 1234L);
        Item three = new Item("test3", "description3", 12345);
        tracker.add(one);
        tracker.add(two);
        tracker.add(three);
        tracker.delete(two.getId());
        Item[] result = tracker.findAll();
        Item[] expect = new Item[] {one, three};
        assertArrayEquals(result, expect);

    }

    @Test
    public void whenIntoArrayHasNullThenReturnNewArrayWithoutNull() {
        Tracker tracker = new Tracker();
        Item[] item = new Item[10];
        Item one = new Item("test1", "test1description1", 123L);
        Item two = new Item("test2", "test2description", 1234L);
        tracker.add(one);
        tracker.add(two);
        item = tracker.findAll();
        int result = item.length;
        assertThat(result, is(2));



    }

    @Test
    public void whenFindNameThenCopyItemInResultArray() {
        Tracker tracker = new Tracker();
        Item one = new Item("test2", "testdescription1", 123L);
        Item two = new Item("test2", "testdescription2", 1234L);
        Item three = new Item("test3", "testdescriotion3", 125L);
        Item four = new Item("test2", "testdescription4", 564L);
        tracker.add(one);
        tracker.add(two);
        tracker.add(three);
        tracker.add(four);
        Item[] result = tracker.findByName("test2");
        Item[] expect = new Item[] {one, two, four};
        assertArrayEquals(result, expect);



    }


}