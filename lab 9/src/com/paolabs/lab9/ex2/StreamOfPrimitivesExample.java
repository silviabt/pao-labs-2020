package com.paolabs.lab9.ex2;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamOfPrimitivesExample {

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 3);
        intStream.forEach(i -> System.out.print(i + " "));

        System.out.println();

        LongStream longStream = LongStream.rangeClosed(1, 3);
        longStream.forEach(l -> System.out.print(l + " "));

        System.out.println();

        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);
        doubleStream.forEach(d -> System.out.print(d + " "));
    }
}
