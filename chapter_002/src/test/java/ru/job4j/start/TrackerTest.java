package ru.job4j.start;

import org.junit.Test;
import ru.job4j.models.Item;

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
        assertThat(tracker.findById(previous.getId()).getName(), is("test2")  );



    }

    @Test
    public void whenDeleteIdThenReturnNewLength() {
        Tracker tracker = new Tracker();
        Item one = new Item("test1", "testdescription1", 123L);
        Item two = new Item("test2", "testdescription2", 1234L );
        Item three = new Item("test3", "description3", 12345);
        tracker.add(one);
        tracker.add(two);
        tracker.add(three);
        boolean res = tracker.delete(three.getId());
        tracker.delete(two.getId());
        assertThat(res, is(true));

    }


}