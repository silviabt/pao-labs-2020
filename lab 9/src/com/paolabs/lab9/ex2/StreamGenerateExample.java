package com.paolabs.lab9.ex2;

import java.util.stream.Stream;

public class StreamGenerateExample {

    public static void main(String[] args) {
        // creates a sequence of ten strings with the value – “element”.
        Stream<String> streamGenerated =
                Stream.generate(() -> "element").limit(10);
    }
}
