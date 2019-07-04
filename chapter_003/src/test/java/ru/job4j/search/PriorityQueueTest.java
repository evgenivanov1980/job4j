package ru.job4j.search;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesk(), is("urgent"));
    }

    @Test
    public void whenHigherPriority1() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("middle", 8));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("midst", 3));
        queue.put(new Task("higher", 10));
        Task result = queue.take();
        assertThat(result.getDesk(), is("urgent"));
    }

    @Test
    public void whenHightPriority2() {

        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.put(new Task("Бездельничать", 5));

        priorityQueue.put(new Task("Читать худ литературу", 4));

        priorityQueue.put(new Task("Выполнить работу ", 3));

        priorityQueue.put(new Task("Читать теорию по Java", 2));

        priorityQueue.put(new Task("Практиковаться по задачам", 1));

        priorityQueue.put(new Task("Практиковаться", 1));

        Task result = priorityQueue.take();

        assertThat(result.getDesk(), is("Практиковаться"));

    }


}