package com.paolabs.lab10.ex2;

public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from another thread!");
    }
}
