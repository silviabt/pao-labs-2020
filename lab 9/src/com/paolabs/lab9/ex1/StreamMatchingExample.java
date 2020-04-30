package com.paolabs.lab9.ex1;

import java.util.Arrays;
import java.util.List;

public class StreamMatchingExample {

    public static void main(String[] args) {
        List<String> actors = Arrays.asList("Robert De Niro", "Jack Nicholson", "Denzel Washington", "Robert De Niro");

        boolean anyMatch = actors.stream().anyMatch(actor -> actor.contains("Robert"));
        boolean allMatch = actors.stream().allMatch(actor -> actor.contains("Robert"));
        boolean noneMatch = actors.stream().noneMatch(actor -> actor.contains("Robert"));

        System.out.println(anyMatch);
        System.out.println(allMatch);
        System.out.println(noneMatch);
    }
}
