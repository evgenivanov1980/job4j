package ru.job4j.streamapi.students;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Roster {

    public Map<String, Student> collect(List<Student> students) {
        return students.stream().collect(Collectors.toMap(Student::getSurname, student -> student, (student, student2) -> student));
    }
}
