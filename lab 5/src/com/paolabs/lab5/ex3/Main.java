package com.paolabs.lab5.ex3;

public class Main {

    public static void main(String[] args) {

        FunctionalInterfaceExemplul1 functionalInterfaceExemplul1 = () -> {
            System.out.println("Executing...");
        };

        functionalInterfaceExemplul1.execute();
    }
}
