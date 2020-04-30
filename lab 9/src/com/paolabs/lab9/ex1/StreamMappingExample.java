package com.paolabs.lab9.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMappingExample {

    public static void main(String[] args) {
        //map
        List<String> actors = Arrays.asList("Robert De Niro", "Jack Nicholson", "Denzel Washington", "Samuel L. Jackson");

        Stream<String> result = actors.stream().map(actor -> actor.toUpperCase());
        result.forEach(System.out::println);

        // flatMap
        List<String> actorsInMovie1 = Arrays.asList("Robert De Niro", "Jack Nicholson");
        List<String> actorsInMovie2 = Arrays.asList("Denzel Washington", "Samuel L. Jackson");

        List<List<String>> actorsInMovies = Arrays.asList(actorsInMovie1, actorsInMovie2);

        Stream<String> allActors = actorsInMovies.stream().flatMap(strings -> strings.stream());
        allActors.forEach(System.out::println);
    }
}
