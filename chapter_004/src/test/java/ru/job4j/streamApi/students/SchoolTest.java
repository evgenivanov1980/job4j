package ru.job4j.streamApi.students;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class SchoolTest {
    @Test
    public void whenScoresHaveFromSeventyToHundred() {

        List<Student> A = List.of(
                new Student(60, "Ivanov"),
                new Student(70, "Petrov"),
                new Student(90, "Sidirov")

        );
        List<Student> result = new School().collect(A, p -> p.getScore() >= 70 && p.getScore() <= 100);
        List<Student> expect = List.of(
                new Student(70, "Petrov"),
                new Student(90, "Sidirov")
        );
        assertThat(result, is(expect));

    }
    @Test
    public void whenScoresHaveFromFiftyToSeventy() {
        List<Student> B = List.of(
                new Student(60, "Ivanov"),
                new Student(70, "Petrov"),
                new Student(90, "Sidirov")

        );
        List<Student> result = new School().collect(B, p -> p.getScore() >= 50 && p.getScore() <= 70);
        List<Student> expect = List.of(
                new Student(60, "Ivanov"),
                new Student(70, "Petrov")

        );
        assertThat(result, is(expect));


    }
    @Test
    public void whenScoresHaveFromZeroToFifty() {
        List<Student> C = List.of(
                new Student(1, "Ivanov"),
                new Student(45, "Petrov"),
                new Student(90, "Sidirov")

        );
        List<Student> result = new School().collect(C, p -> p.getScore() >= 0 && p.getScore() <= 50);
        List<Student> expect = List.of(
                new Student(1, "Ivanov"),
                new Student(45, "Petrov")

        );
        assertThat(result, is(expect));


    }





}