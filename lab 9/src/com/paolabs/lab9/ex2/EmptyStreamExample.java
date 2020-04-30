package com.paolabs.lab9.ex2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EmptyStreamExample {

    public static void main(String[] args) {
        Stream<String> streamEmpty = Stream.empty();

        Stream<String> movies = streamOf(Arrays.asList("Robert De Niro", "Jack Nicholson", "Denzel Washington", "Samuel L. Jackson"));
        Stream<String> emptyStream = streamOf(null);
    }

    public static Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }
}
