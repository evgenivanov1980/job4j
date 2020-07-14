package ru.job4j.streamApi.students;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Roster {
    private Student student;

    public Map<String, Student> collect(List<Student> students) {
        return students.stream().distinct().collect(Collectors.toMap(Student::getSurname, student1 -> student));
    }
}
