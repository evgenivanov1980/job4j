package ru.job4j.streamApi.touristCompany;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map( x -> new Address()).collect(Collectors.toList());

    }
}
