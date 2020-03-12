package com.paolabs.lab3.exemplul3;

public class Passenger {

    private int freeBags;
    private int checkedBags;
    private char flightClass;

    public Passenger() {
    }

    public Passenger(int freeBags) {
        this.freeBags = freeBags;
    }

    public Passenger(char flightClass) {
        this.flightClass = flightClass;
    }

    public Passenger(int freeBags, int checkedBags) {
        this(freeBags);
        this.checkedBags = checkedBags;
    }

    public int getFreeBags() {
        return freeBags;
    }

    public void setFreeBags(int freeBags) {
        this.freeBags = freeBags;
    }

    public int getCheckedBags() {
        return checkedBags;
    }

    public void setCheckedBags(int checkedBags) {
        this.checkedBags = checkedBags;
    }

    public char getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(char flightClass) {
        this.flightClass = flightClass;
    }
}
