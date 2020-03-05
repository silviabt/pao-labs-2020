package com.paolabs.lab2.exemplul5;

public class Exemplul5 {

    public static void main(String[] args) {
        Flight flight1 = new Flight();
        flight1.addPassenger();

        System.out.println(flight1.getPassengers());
        System.out.println(flight1.getSeats());
    }
}
