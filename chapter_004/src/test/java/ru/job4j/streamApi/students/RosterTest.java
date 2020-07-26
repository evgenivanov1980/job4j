package ru.job4j.streamApi.students;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class RosterTest {
    @Test
    public void whenStudentIsListThenConvertItToMap() {
        Roster roster = new Roster();
        Map<String, Student> studentMap = new HashMap<>();
        List<Student> students = new ArrayList<>();
        Student one = new Student(5, "Ivanov");
        Student two = new Student(10, "Petrov");
        students.add(one);
        students.add(two);
        studentMap = roster.collect(students);
        assertThat(studentMap.get(one.getSurname()), is(one));
    }

}