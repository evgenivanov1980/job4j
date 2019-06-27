package ru.job4j.search;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class PhoneDictionaryTest {
    @Test
    public void whenFinfByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Evgeny", "Ivanov", "5119", "Minsk")
        );
        List<Person> persons = phones.find("Evgeny");
        assertThat(persons.iterator().next().getSurname(), is("Ivanov"));
    }

}