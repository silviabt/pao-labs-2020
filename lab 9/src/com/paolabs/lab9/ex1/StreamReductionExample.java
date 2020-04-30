package com.paolabs.lab9.ex1;

import java.util.Arrays;
import java.util.List;

public class StreamReductionExample {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 1, 1);

        Integer reduced = integers.stream().reduce(10, (a, b) -> a + b);

        System.out.println(reduced);
    }
}
