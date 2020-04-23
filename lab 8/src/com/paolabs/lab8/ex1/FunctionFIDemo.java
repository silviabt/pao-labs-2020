package com.paolabs.lab8.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class FunctionFIDemo {

    public static String concatStringsBiFunction(String s1, String s2) {
        BiFunction<String, String, String> concat = (a, b) -> a + b;
        String combinedStr = concat.apply(s1, s2);
        return combinedStr;
    }

    public static int multiplyTwoIntsBiFunction(int i1, int i2) {
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        Integer product = multiply.apply(i1, i2);
        return product;
    }

    public static String convertDoubleToStringDoubleFunction(double d) {
        DoubleFunction<String> doubleToString = num -> Double.toString(num);
        return doubleToString.apply(d);
    }

    public static int convertDoubleToIntDoubleToIntFunction(double d) {
        DoubleToIntFunction doubleToInt = num -> (int) num;
        return doubleToInt.applyAsInt(d);
    }

    public static long convertDoubleToLongDoubleToLongFunction(double d) {
        DoubleToLongFunction doubleToLongFunc = num -> (long) num;
        return doubleToLongFunc.applyAsLong(d);
    }

    public static void convertStringToIntegerFunction() {
        Function<String, Integer> convertToWordCount = String::length;
        List<String> words = Arrays.asList("The", "That", "John", "Thanks");

        List<Integer> wordsCounts = words.stream().map(convertToWordCount).collect(Collectors.toList());

        for (int n : wordsCounts) {
            System.out.println(n);
        }
    }

    public static String convertIntegerToStringIntFunction(int number) {
        IntFunction<String> intToString = num -> Integer.toString(num);

        return intToString.apply(number);
    }

    public static double convertIntToDoubleIntToDoubleFunction(int number) {
        IntToDoubleFunction intToDoubleFunc = num -> (double) num;

        return intToDoubleFunc.applyAsDouble(number);
    }

    public static double powerTwoIntToDoubleBiFunction(int i1, int i2) {
        ToDoubleBiFunction<Integer, Integer> concat = (a, b) -> Math.pow(a, b);
        double powerRet = concat.applyAsDouble(i1, i2);
        return powerRet;
    }
}
