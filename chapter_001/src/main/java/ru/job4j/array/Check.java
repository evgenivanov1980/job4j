package ru.job4j.array;



public class Check {
    public boolean mono(boolean[] date) {
        boolean result = true;
        for (int index = 0; index < date.length; index++) {
            if (result != date[index]) {
                result = false;

            }


        }
        return result;


    }
}
