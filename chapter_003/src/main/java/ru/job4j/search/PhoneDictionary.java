package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

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
        List<Person> result = new ArrayList<>();
        for (Person persons  : persons) {
            if (persons.getName().contains(key) || persons.getSurname().contains(key) || persons.getAddress().contains(key) || persons.getPhone().contains(key)) {
                result.add(persons);
            }
        }
        return result;


    }
}


