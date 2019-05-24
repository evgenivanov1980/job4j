package ru.job4j.start;

public class Exit extends BaseAction {

    private final StartUI ui;


    public Exit(StartUI input, int key, String name) {
        super(key, name);
        ui =input;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        this.ui.stop();
        System.out.println();
    }


    }



