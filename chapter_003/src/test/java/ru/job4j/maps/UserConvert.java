package ru.job4j.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserConvert {
    public HashMap<Integer, User> process(List<User> list) {
       HashMap people = new HashMap<Integer, User>();
       for (User user : list) {
           people.put(user.getId(), user);
       }

       return people;




    }
}
