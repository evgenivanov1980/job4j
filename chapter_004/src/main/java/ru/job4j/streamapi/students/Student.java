package ru.job4j.streamapi.students;

import java.util.Objects;

public class Student {
    private int score;
    private String surname;

    public Student(int score, String surname) {
        this.score = score;
        this.surname = surname;
    }

    public  int getScore() {
        return score;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return score == student.score && surname == student.surname;
    }
    @Override
    public int hashCode() {
        return Objects.hash(score, surname);
    }

    public String getSurname() {
        return surname;
    }
}
