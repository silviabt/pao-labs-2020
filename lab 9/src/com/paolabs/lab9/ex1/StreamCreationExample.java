package com.paolabs.lab9.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationExample {

    public static void main(String[] args) {
        // stream creation with stream()
        String[] movies = new String[]{"Extraction", "Knives Out", "Sergio"};
        Stream<String> stream = Arrays.stream(movies);

        // stream creation with stream()
        Stream<String> anotherStream = Stream.of("Extraction", "Knives Out", "Sergio");

        // creating a stream using any collection as an element source
        List<String> actors = Arrays.asList("Robert De Niro", "Jack Nicholson", "Denzel Washington");
        Stream<String> actorsStream = actors.stream();
    }
}
