package ru.job4j.streamApi.students;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class RosterTest {
    @Test
    public void whenStudentIsListThenConvertItToMap() {
        Roster roster = new Roster();
        Map<String, Student> studentMap;
        List<Student> students = Arrays.asList(
                new Student(5, "Ivanov"),
                new Student(10, "Petrov"),
                new Student(7, "Ivanov")
        );
        Map<String, Student> expected = new HashMap<>();
        expected.put("Ivanov", new Student(5, "Ivanov"));
        expected.put("Petrov", new Student(10, "Petrov"));
        Map<String, Student> result = roster.collect(students);
        assertThat(result, is(expected));
    }

}