package com.paolabs.lab10.ex2;

public class Main {

    // starting point of the main thread
    public static void main(String[] args) {
        Thread helloThread = new Thread(new HelloRunnable());
        helloThread.start();

        System.out.println("End main!");
    }
}
