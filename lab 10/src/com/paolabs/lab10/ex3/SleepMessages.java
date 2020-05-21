package com.paolabs.lab10.ex3;

import java.util.Arrays;
import java.util.List;

public class SleepMessages {

    public static void main(String[] args) throws InterruptedException {
        List<String> info = Arrays.asList("Hello", "there", "Hi", "again!");

        for (String s : info) {
            //Pause for 4 seconds
            Thread.sleep(4000);
            //Print a message
            System.out.println(s);
        }
    }
}
