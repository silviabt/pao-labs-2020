package com.paolabs.lab9.ex2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamOfFileExample {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/resources/input.txt");

        Stream<String> streamOfStrings = Files.lines(path);
        streamOfStrings.forEach(System.out::println);


        Stream<String> streamWithCharset = Files.lines(path, StandardCharsets.UTF_8);
        streamWithCharset.forEach(System.out::println);
    }
}
