package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * метод должен вставлять в нужную позирцию элемент
     * Позицию определять по полю приоритет
     * Для вставки использовать add(int index, E value)
     *
     * @param task задача
     */


    public void put(Task task) {
        int k = 0;
        for (Task task1 : tasks) {
            if (task1.getPriorety() < task.getPriorety()) {
                k++;


            } else {
                break;
            }


        }


        tasks.add(k, task);


    }


    public Task take() {
        return this.tasks.poll();
    }
}



