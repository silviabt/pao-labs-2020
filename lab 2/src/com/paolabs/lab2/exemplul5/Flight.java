package com.paolabs.lab2.exemplul5;

public class Flight {

    private int passengers;
    private int seats;

    public Flight() {
        seats = 150;
        passengers = 0;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    // executable code that manipulates state and performs operations
    // Return type - Use void when no value is returned
    public void addPassenger() {
        if (passengers < seats) {
            passengers++;
        } else {
            handleTooManyPassengers();
        }
    }

    private void handleTooManyPassengers() {
        System.out.println("There are too many passengers.");
    }

}
