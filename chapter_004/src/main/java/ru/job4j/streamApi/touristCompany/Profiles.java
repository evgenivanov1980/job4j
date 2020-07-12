package ru.job4j.streamApi.touristCompany;

import java.util.*;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        List<Address> result;
        result =  profiles.stream().map( x -> x.getAddress()).collect(Collectors.toList());
        return result.stream().sorted(new CityComparatot()).distinct().collect(Collectors.toList());


    }
}
class CityComparatot implements Comparator<Address> {

    @Override
    public int compare(Address o1, Address o2) {
        return o1.getCity().compareTo(o2.getCity());
    }
}
