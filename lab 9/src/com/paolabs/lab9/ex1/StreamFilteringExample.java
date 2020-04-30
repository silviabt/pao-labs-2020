package com.paolabs.lab9.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilteringExample {

    public static void main(String[] args) {
        List<String> actors = Arrays.asList("Robert De Niro", "Jack Nicholson", "Denzel Washington", "Samuel L. Jackson");

        // filtering
        Stream<String> result = actors.stream().filter(actor -> actor.contains("Jack"));
    }
}
