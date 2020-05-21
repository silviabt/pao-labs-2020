package com.paolabs.lab10.ex1;

public class Main {

    // starting point of the main thread
    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread();
        helloThread.start(); // you want your thread here to begin the execution

        System.out.println("End main!");
    }
}
