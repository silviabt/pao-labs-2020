package com.paolabs.lab3.exemplul2;

public class PracticeParameterImmutability {

    public static void main(String[] args) {

        int val1 = 10;
        int val2 = 20;

        System.out.println("val1 = "+ val1);
        System.out.println("val2 = "+ val2);

        swap(val1, val2);

        System.out.println("val1 = "+ val1);
        System.out.println("val2 = "+ val2);


        Flight flight1 = new Flight(10);
        Flight flight2 = new Flight(15);

        // flight 1 and flight 2 are not the objects themselves but references to the Flight objects
        // changes made to passed value are not visible outside of method
        System.out.println("flight1 = "+ flight1.getFlightNumber());
        System.out.println("flight2 = "+ flight2.getFlightNumber());

        swap(flight1, flight2);

        System.out.println("flight1 = "+ flight1.getFlightNumber());
        System.out.println("flight2 = "+ flight2.getFlightNumber());

        // changes made to members of passed class instances are visible outside of method
        Flight flight3 = new Flight(10);
        Flight flight4 = new Flight(15);

        System.out.println("flight3 = "+ flight3.getFlightNumber());
        System.out.println("flight4 = "+ flight4.getFlightNumber());

        swapNumbers(flight3, flight4);

        System.out.println("flight3 = "+ flight3.getFlightNumber());
        System.out.println("flight4 = "+ flight4.getFlightNumber());
    }

    public static void swap(int i, int j) {
        System.out.println("i = "+ i);
        System.out.println("j = "+ j);

        int k = i;
        i = j;
        j = k;

        System.out.println("i = "+ i);
        System.out.println("j = "+ j);
    }

    public static void swap(Flight f1, Flight f2) {
        System.out.println("f1 = "+ f1.getFlightNumber());
        System.out.println("f2 = "+ f2.getFlightNumber());

        Flight k = f1;
        f1 = f2;
        f2 = k;

        System.out.println("f1 = "+ f1.getFlightNumber());
        System.out.println("f2 = "+ f2.getFlightNumber());
    }

    public static void swapNumbers(Flight f3, Flight f4) {
        System.out.println("f3 = "+ f3.getFlightNumber());
        System.out.println("f4 = "+ f4.getFlightNumber());

        int k = f3.getFlightNumber();
        f3.setFlightNumber(f4.getFlightNumber());
        f4.setFlightNumber(k);

        System.out.println("f3 = "+ f3.getFlightNumber());
        System.out.println("f4 = "+ f4.getFlightNumber());
    }
}
