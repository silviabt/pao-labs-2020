package com.paolabs.lab2.exemplul6;

public class Calculator {

    public Calculator() {
    }

    public void showSum(float x, float y, int count) {
        if (count < 1) {
            return;
        }
        float sum = x + y;
        for (int i = 0; i < count; i++) {
            System.out.println(sum);
        }
    }
}
