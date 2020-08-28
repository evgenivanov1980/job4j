package ru.job4j.streamapi.students;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class RosterTest {
    @Test
    public void whenStudentIsListThenConvertItToMap() {
        Roster roster = new Roster();
        List<Student> students = List.of(
                new Student(5, "Ivanov"),
                new Student(10, "Petrov"),
                new Student(7, "Ivanov")
        );
        Map<String, Student> expected = Map.of("Ivanov", new Student(5, "Ivanov"),
                                               "Petrov", new Student(10, "Petrov"));
        Map<String, Student> result = roster.collect(students);
        assertThat(result, is(expected));
    }

}