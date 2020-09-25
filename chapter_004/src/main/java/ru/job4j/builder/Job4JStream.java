package ru.job4j.builder;

import java.util.List;
import java.util.function.Predicate;

public class Job4JStream {
    private List<String> source;
    private Predicate<String> filter;


    public static Job4JStream of(List<String> list) {
        return new Builder()
                .of(list)
                .build();

    }

    public static Job4JStream filter(Predicate<String> predicate) {
        return new Builder()
                .filter(predicate)
                .build();
    }

    public  List<String> collect(List<String> list) {
        Job4JStream job4j = new Job4JStream();
        return new Builder()
                .of(job4j.source)
                .filter(job4j.filter)
                .collect(list.forEach())
                .build();
    }






    public static class Builder {

        private Predicate<String> predicate;
        private List<String> list;

        public Builder of(List<String> list) {
            this.list = list;
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

        public Job4JStream build() {
            Job4JStream job4j = new Job4JStream();
            job4j.source = list;
            job4j.filter = predicate;
            return job4j;
        }

        public Builder self() {
            return this;
        }

    }




}
