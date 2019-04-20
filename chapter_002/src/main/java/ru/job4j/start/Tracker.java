package ru.job4j.start;

import ru.job4j.models.*;

import java.lang.*;
import java.util.*;


public class Tracker {
    private Item[] items = new Item[10];
    private int position = 0;
    private static final Random RN = new Random();


    /**
     * Метод добавляет заявку, переданную в аргументах в массив заявок items. В методе генерируется уникадьный
     * ключ (id) на основании времени и произвольного числа, это делается вызовом Item.setID(this.generatedID). Где
     * generatedID и есть метод генерирующий наш id. После чего сгенерированная новая заявка добавляется в массив items
     * и позиция(position) ячеqки сдвигается на одну.
     *
     * @param item - наша заявка, содержащая поля класса Item (имя, описание, дата создания, уникальный ключ id).
     * @return возвращает добавленную заявку
     */

    public Item add(Item item) {
        item.setId(this.generatedId());
        this.items[position++] = item;
        return item;
    }

    /**
     * Метод замены заявки. Метод находит заявку по уникальному ключу id в массиве items и заменяет ее на новую.
     *
     * @param id   уникальный ключ заявки, генерируемый в методе generatedID
     * @param item входящая заявка которую нужно вставить вместо предыдущей
     * @return метод возвращает true если удалось заменить заявку
     */

    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
            if (item.getId().equals(id)) {
                item.setId(id);
                items[i] = item;
                result = true;
                break;


            }


        }
        return result;


    }

    /**
     * Метод удаления заявки. Метод находит ячейку в массиве по id. Далее смещаем все значения справа от удаляемого
     * элемента - на одну ячейку влево с помощью System.arrayCopy(), удаляя таким образом найденную ячейку.
     *
     * @param id ячейки (заявки) которую нужно удалить.
     * @return метод возвращет true если, оперция по удалению завершилась успешно.
     */

    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
            if (this.items[i].getId().equals(id)) {
                System.arraycopy(items, i + 1, items, i, items.length - i - 1);
                items[position--] = null;
                result = true;
                break;

            }

        }
        return result;
    }


    /** Метод находит все заявки в массиве, после чего обрезает ячейки со значением null, оставляя таким образом
     *  в массиве только заявки/
     * @return возвращет массив без значений null.
     */

    public Item[] findAll() { return Arrays.copyOf(items, position); }






    protected Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    String generatedId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    public Item[] getAll() {
        Item[] result = new Item[this.position];
        for (int i = 0; i != this.position; i++) {
            result[i] = this.items[i];
        }
        return result;
    }


}
