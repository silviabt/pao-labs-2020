package com.paolabs.lab3.exemplul4;

public class TestVehicle {

    public static void main(String[] args) {

        Car c1 = new Car();
        System.out.println(c1.seats);
        System.out.println(c1.getDoors());

        Bus b1 = new Bus();
        System.out.println(b1.seats);
        System.out.println(b1.getDoors());

        Car c2 =  new Bus();
        System.out.println(c2.seats);
        System.out.println(c2.getDoors());

    }
}
