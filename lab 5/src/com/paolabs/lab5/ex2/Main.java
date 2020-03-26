package com.paolabs.lab5.ex2;

public class Main {

    public static void main(String[] args) {

        Producer<Car> carProducer = new CarProducer<Car>();
        Car car = carProducer.produce();

        Producer<String> myStringProducer = new CarProducer<String>();
        String produce1 = myStringProducer.produce();

        Producer<Bike> bikeProducer = new BikeProducer();
        Bike bike = bikeProducer.produce();
    }
}
