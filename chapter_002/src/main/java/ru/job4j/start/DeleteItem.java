package ru.job4j.start;

public class DeleteItem implements UserAction {
    @Override
    public int key() {
        return 3;
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

    @Override
    public String info() {
        return "Удалить заявку";
    }
}
