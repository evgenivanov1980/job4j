package ru.job4j.start;

public class StartUITest {
    public static void main(String[] args) {
        Input input = (new StubInput(new String[]{"0", "testname", "testdesk", "6"}));
        Tracker tracker = new Tracker();
        new StartUI(input, tracker).init();


    }
}
