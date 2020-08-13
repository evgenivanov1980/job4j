package ru.job4j.streamApi.students;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class StudentLevelTest {
    @Test
    public void whenSorted() {
        List<Student> input = new ArrayList<>();
        input.add(new Student(128, "Petrov"));
        input.add(new Student(28, "Ivanova"));
        List<Student> expected = List.of(new Student(28, "Ivanova"),
                                         new Student(128, "Petrov"));
        assertThat(StudentLevel.levelof(input, 20), is(expected));
    }
    @Test
    public void whenOnlyNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        List<Student> expected = List.of();
        assertThat(StudentLevel.levelof(input, 100), is(expected));
    }
    @Test
    public void whenHasNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        input.add(new Student(28, "Petrov"));
        List<Student> expected = List.of(new Student(28, "Petrov"));
        assertThat(StudentLevel.levelof(input, 10), is(expected));
    }
    @Test
    public void whenBoundMoreThanTen() {
        List<Student> input = new ArrayList<>();
        input.add(new Student(128, "Ivanov"));
        input.add(new Student(5, "Petrov"));
        input.add(new Student(28, "Godorenko"));
        input.add(new Student(7, "Sidorova"));
        List<Student> expected = List.of(new Student(128, "Ivanov"),
                                         new Student(28, "Godorenko"));
        assertThat(StudentLevel.levelof(input, 10), is(expected));


    }

}