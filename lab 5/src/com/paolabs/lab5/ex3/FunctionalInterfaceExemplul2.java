package com.paolabs.lab5.ex3;

public interface FunctionalInterfaceExemplul2 {

    public void execute();

    public default void print(String text) {
        System.out.println(text);
    }

    public static void print(String text, String name) {
        System.out.println(name + ": " + text);
    }
}
