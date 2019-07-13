package ru.job4j.maps;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;


public class UserConvertTest {
    @Test
    public void whenHaveListThenConvertMap() {
        UserConvert convert = new UserConvert();
        List<User> list = new ArrayList<>();
        User one = new User(10, "Evgeny", "Ufa");
        User two = new User(20, "Lena", "Tula");
        list.add(one);
        list.add(two);
        HashMap result = convert.process(list);
        assertThat(result.get(10), is(one));
        assertThat(result.get(20), is(two));
        assertThat(result.size(), is(2));

        

    }

}