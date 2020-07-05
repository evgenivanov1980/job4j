package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();

    public void add(Person person) {

        this.persons.add(person);


        }
    /**
     * Вернуть список всех пользователей, который содержит key в любых полях
     * @param key ключ поиска
     * @return список подходящих пользователей
     */

    public List<Person> find(String key) {
        Predicate<Person> combine = person -> person.getName().contains(key) || person.getSurname().contains(key)
                || person.getAddress().contains(key) || person.getPhone().contains(key);
        List<Person> result = new ArrayList<>();
        for (Person person  : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;


    }
}


