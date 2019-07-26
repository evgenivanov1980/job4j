package ru.job4j.usersort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class SortUserTest {
    @Test
    public void whenHaveListThenSortedAtAge() {
        User userone = new User("Evgen", "25");
        User usertwo = new User("Lena", "29");
        User userthree = new User("Misha", "26");
        List<User> users = new ArrayList<>();
        users.add(userone);
        users.add(usertwo);
        users.add(userthree);
        SortUser sort = new SortUser();
        TreeSet<User> expected = new TreeSet<>();
        expected.add(userone);
        expected.add(usertwo);
        expected.add(userthree);
        assertThat(sort.sort(users), is(expected));


    }

    @Test
    public void whenHaveListThenSortedAtLengthName() {
        User userone = new User("Evgeny", "25");
        User usertwo = new User("Lena", "29");
        User userthree = new User("Misha", "26");
        List<User> users = new ArrayList<>();
        users.add(userone);
        users.add(usertwo);
        users.add(userthree);
        SortUser sortlenth = new SortUser();
        List<User> result = sortlenth.sortNameLength(users);
        assertThat(result.get(2), is(userone));

    }

    @Test
    public void whenSortByAllFields() {
        User userone = new User("Sergei", "25");
        User usertwo = new User("Ivan", "30");
        User userthree = new User("Sergei", "20");
        User userfour = new User("Ivan", "25");
        List<User> users = new ArrayList<>();
        users.add(userone);
        users.add(usertwo);
        users.add(userthree);
        users.add(userfour);
        SortUser sortAllFields = new SortUser();
        List<User> result = sortAllFields.sortByAllFields(users);
        List<User> expected = new ArrayList<>();
        expected.add(userfour);
        expected.add(usertwo);
        expected.add(userthree);
        expected.add(userone);
        assertThat(result, is(expected));



    }


}