package com.paolabs.lab9.ex2;

import java.util.stream.Stream;

public class StreamIterateExample {

    public static void main(String[] args) {
        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);

        streamIterated.forEach(System.out::println);
    }
}
