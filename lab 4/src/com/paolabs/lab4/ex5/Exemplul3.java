package com.paolabs.lab4.ex5;

public class Exemplul3 {

    public static void main(String[] args) {
        String s1 = "A chain is only as strong as its weakest link";

        int length = s1.length();
        System.out.println("Length: " + length);

        char charAt = s1.charAt(2);
        System.out.println("The char value at the index 2:" + charAt);

        String[] strings = s1.split(" ");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        String substring = s1.substring(2, 7);
        System.out.println(substring);
    }
}
