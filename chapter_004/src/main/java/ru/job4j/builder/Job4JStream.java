package ru.job4j.builder;

import java.util.List;
import java.util.function.Predicate;

public class Job4JStream {
    private List<String> source;
    private Predicate<String> filter;
    private String[] array;


    public static class Builder {
        private String[] array;
        private Predicate<String> predicate;
        private List<String> list;

        public Builder of(String[] array) {
            this.array = array;
            return self();
        }

        public Builder filter(Predicate<String> predicate) {
            this.predicate = predicate;
            return self();
        }

        public Builder collect(List<String> list) {
            this.list = list;
            return self();
        }

        public Builder self() {
            return this;
        }

    }
    public static void myStream() {
        Job4JStream job4JStream = new Builder().of(array).filter(predicate).collect(list).self();

    }



}
