package ru.job4j.start;

public class DeleteItem extends BaseAction {

    public DeleteItem(int key, String name) {
        super(key, name);
    }


    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("-------Удаление заявки------");
        String id = input.ask("Введите id заявки");
        if (tracker.delete(id)) {
            System.out.println("---- Удаление заявки прошло успешно ----");
        } else {
            System.out.println("----- Заявка с таким id не найдена");
        }
    }


}
