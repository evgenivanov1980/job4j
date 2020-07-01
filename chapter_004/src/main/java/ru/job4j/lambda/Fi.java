package ru.job4j.lambda;

import java.util.Comparator;
import java.util.TreeSet;

public class Fi  {
    public static void main(String[] args) {
        Comparator<String> cmpText = (left, right) -> left.compareTo(right);
        Comparator<String> cmpDescSize = (left, right) -> Integer.compare(left.length(), right.length());


        
    }
}
