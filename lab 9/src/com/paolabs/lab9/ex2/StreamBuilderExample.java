package com.paolabs.lab9.ex2;

import java.util.stream.Stream;

public class StreamBuilderExample {

    public static void main(String[] args) {
        Stream<String> actors = Stream.<String>builder()
                .add("Robert De Niro")
                .add("Jack Nicholson")
                .add("Denzel Washington")
                .build();
    }
}
