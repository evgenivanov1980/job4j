package ru.job4j.builder;

import java.util.List;
import java.util.function.Predicate;

public class Job4JStream {
     List source;
     Predicate filter;

    public static Job4JStream of(List) {


    }

    public static Job4JStream filter(Predicate) {


    }

    public static Job4JStream collect(List) {


    }

}

interface Builder {
    Builder setSource(List source);

    Builder setPredicate(Predicate filter);

    Job4JStream build();
}

class Job4JStreamBuilder implements Builder {
    Job4JStream job4j = new Job4JStream();

    @Override
    public Builder setSource(List source) {
        job4j.source = source;
        return this;
    }

    @Override
    public Builder setPredicate(Predicate filter) {
        job4j.filter = filter;
        return this;
    }

    @Override
    public Job4JStream build() {
        return job4j;
    }
}

