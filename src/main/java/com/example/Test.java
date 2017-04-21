package com.example;

import java.util.Arrays;
import java.util.List;

/**
 * Created by atsk1618 on 4/20/2017.
 */
public class Test {

    public static void main (String [] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // reduce
        int sum = numbers.stream()
                .reduce(0, Integer::sum); // sum all mumbers
        System.out.println(sum);

    }
}
