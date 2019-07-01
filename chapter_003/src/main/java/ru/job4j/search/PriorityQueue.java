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

        for (int i = 0; i <= tasks.size(); i++) {


            if (tasks.size() == 0) {
                tasks.add(i, task);


            }
            else if (task.getPriorety() < tasks.getFirst().getPriorety()) {
                tasks.add(i, task);

            }
            else if (task.getPriorety() > tasks.getFirst().getPriorety() && task.getPriorety() < tasks.getLast().getPriorety()) {
                tasks.add(i + 1, task);
                break;
            }

        }


    }


    public Task take() {
        return this.tasks.poll();
    }
}



