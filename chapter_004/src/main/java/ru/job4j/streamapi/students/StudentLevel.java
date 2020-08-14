package ru.job4j.streamapi.students;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StudentLevel {
    public static List<Student> levelof(List<Student> students, int bound) {
        return  students.stream().filter(Objects::nonNull).sorted(Comparator.comparingInt(Student::getScore).reversed()).
                takeWhile(student -> student.getScore() > bound).collect(Collectors.toList());

    }
}
