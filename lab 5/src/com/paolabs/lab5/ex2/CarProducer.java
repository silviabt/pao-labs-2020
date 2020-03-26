package com.paolabs.lab5.ex2;

public class CarProducer<T> implements Producer<T> {

    @Override
    public T produce() {
        return (T) new Car();
    }
}
