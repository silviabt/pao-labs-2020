package com.paolabs;

import java.util.Scanner;

public class Exemplul5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // The Scanner class is used to get user input, and it is found in the java.util package.
        System.out.println("Enter username:");
        String user = scanner.nextLine();
        System.out.println(user);

        System.out.println("Enter number:");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("Not known");
        }
    }

}
