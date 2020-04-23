package com.paolabs.lab8.ex1;

import java.util.function.*;
import java.util.stream.Stream;

public class PredicateDemo {

    public boolean whichIsBiggerBiPredicate(int n1, int n2) {
        BiPredicate<Integer, Integer> isBigger = (x, y) -> x > y;
        return isBigger.test(n1, n2);
    }

    public boolean isPositiveDoublePredicate(double n) {
        DoublePredicate isPositive = x -> x > 0;
        return isPositive.test(n);
    }

    public boolean isNegativeIntPredicate(int n1) {
        IntPredicate isNegative = x -> x < 0;
        return isNegative.test(n1);
    }

    public boolean isDivisibleByThreeLongPredicate(int nr) {
        LongPredicate isDivisibleBy3 = x -> x % 3 == 0;
        return isDivisibleBy3.test(12);
    }

    public boolean isEvenPredicate(int nr) {
        Predicate<Integer> isEven = s -> s % 2 == 0;
        return isEven.test(nr);
    }

    public void streamFilter(String[] fruits) {
        Stream.of(fruits)
                .filter(fruit -> fruit.startsWith("A"))
                .forEach(fruit -> System.out.println("Started with A:" + fruit));
    }
}
