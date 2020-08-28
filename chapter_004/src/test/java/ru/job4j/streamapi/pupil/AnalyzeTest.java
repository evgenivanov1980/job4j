package ru.job4j.streamapi.pupil;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class AnalyzeTest {
    @Test
    public void whenSinglePupil() {
        double average = Analyze.averageScore(
                List.of(
                        new Pupil("Ivanov", List.of(new Subject("Math", 100)))

                ).stream()
        );
        assertThat(average, is(100D));
    }
    @Test
    public void whenPupilAverage() {
        double average = Analyze.averageScore(
                List.of(
                        new Pupil("Ivanov", List.of(new Subject("Math", 100))),
                        new Pupil("Petrov", List.of(new Subject("Math", 60)))
                ).stream()
        );
        assertThat(average, is(80D));
    }

}