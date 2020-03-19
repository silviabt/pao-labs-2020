package com.paolabs.lab4.ex5;

public class Exemplul5 {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("A journey of a thousand miles begins with a single step");

        System.out.println(stringBuffer);
        stringBuffer.replace(2,9, "walk");
        System.out.println(stringBuffer);
    }
}
