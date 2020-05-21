package com.paolabs.lab10.ex1;

public class HelloThread extends Thread {

    // main method of a thread
    @Override
    public void run() {
        System.out.println("Hello from a thread!");
    }
}

