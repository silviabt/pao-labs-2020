package com.paolabs.lab9.ex1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectingExample {

    public static void main(String[] args) {
        List<String> actors = Arrays.asList("Robert De Niro", "Jack Nicholson", "Denzel Washington", "Samuel L. Jackson");

        List<String> resultList
                = actors.stream()
                .map(element -> element.toUpperCase())
                .collect(Collectors.toList());

        resultList.forEach(System.out::println);
    }
}
