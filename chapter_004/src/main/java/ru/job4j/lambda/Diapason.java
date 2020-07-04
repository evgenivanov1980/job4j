package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Diapason {
    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        func = (x) -> 2 * x + 1;
        List<Double> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            result.add(func.apply((double)i));
        }
        return result;
    }
    List<Double> quadratic(int start, int end, Function<Double, Double> func) {
        func = (x) -> 2 * (x * x) + 2 * x + 1;
        List<Double> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            result.add(func.apply((double)i));

        }
        return result;
    }
    List<Double> demonstrative(int start, int end, Function<Double, Double> func) {
        func = (x) -> Math.pow(2, x);
        List<Double> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            result.add(func.apply((double)i));

        }
        return result;
    }

}



