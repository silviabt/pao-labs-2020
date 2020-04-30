package com.paolabs.lab9.ex1;

import java.util.Arrays;
import java.util.List;

public class StreamOperationsExample {

    public static void main(String[] args) {
        List<String> actors = Arrays.asList("Robert De Niro", "Jack Nicholson", "Denzel Washington", "Robert De Niro");

        // stream operations
        long count = actors.stream().distinct().count();

        System.out.println("No of distinct elements: " + count);
    }
}
