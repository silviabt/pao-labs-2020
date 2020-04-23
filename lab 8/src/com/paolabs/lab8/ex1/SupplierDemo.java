package com.paolabs.lab8.ex1;

import java.util.function.*;

public class SupplierDemo {

    public boolean getAsBoolean() {
        BooleanSupplier booleanSupplier = () -> true;
        return booleanSupplier.getAsBoolean();
    }

    public double getAsDouble() {
        DoubleSupplier pi = () -> Math.PI;
        return pi.getAsDouble();
    }

    public int getAsInt() {
        IntSupplier maxInteger = () -> Integer.MAX_VALUE;
        return maxInteger.getAsInt();
    }

    public long getAsLong() {
        LongSupplier maxLongValue = () -> Long.MAX_VALUE;
        return maxLongValue.getAsLong();
    }

    public String asString() {
        Supplier<String> message = () -> "Mary is fun";
        return message.get();
    }
}
