package com.paolabs.lab5.ex2;

public class BikeProducer implements Producer<Bike> {

    @Override
    public Bike produce() {
        return new Bike();
    }
}
