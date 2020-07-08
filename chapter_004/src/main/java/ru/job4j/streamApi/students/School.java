package ru.job4j.streamApi.students;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        return  students.stream().filter(predicate).collect(Collectors.toList());

    }



}
