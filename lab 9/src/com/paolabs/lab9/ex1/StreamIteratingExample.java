package com.paolabs.lab9.ex1;

import java.util.Arrays;
import java.util.List;

public class StreamIteratingExample {

    public static void main(String[] args) {
        List<String> actors = Arrays.asList("Robert De Niro", "Jack Nicholson", "Denzel Washington", "Robert De Niro");

        // iterating
        boolean exists = actors.stream().anyMatch(actor -> actor.equals("Jack Nicholson"));
        System.out.println("Jack Nicholson is in the list of actors? " + (exists ? "Yes" :"No"));
    }
}
