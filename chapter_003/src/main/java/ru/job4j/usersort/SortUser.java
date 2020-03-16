package ru.job4j.usersort;

import java.util.*;

public class SortUser {

    public Set<User> sort(List<User> list) {
        Set<User> users = new TreeSet<User>(list);

        return users;


    }

    public List<User> sortNameLength(List<User> list) {
        list.sort(new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                return Integer.compare(user1.getName().length(), user2.getName().length());
            }
        });


        return list;


    }

    public List<User> sortByAllFields(List<User> list) {
        list.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int user1namelength = (o1.getName().length());
                int user2namelength = (o2.getName().length());
                int result = Integer.compare(user1namelength, user2namelength);

                if (result != 0) {
                    return result;
                } else {
                    String user1age = (o1.getAge());
                    String user2age = (o2.getAge());
                    return user1age.compareTo(user2age);


                }
            }


        });
        return list;
    }
}















