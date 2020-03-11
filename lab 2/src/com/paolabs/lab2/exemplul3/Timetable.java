package com.paolabs.lab2.exemplul3;

class Timetable {

    // fields - store object state
    int noOfStudents;
    int seats;

    /**
     * constructor
     */
    public Timetable() {
        this.noOfStudents = 0;
        this.seats = 150;
    }

    /**
     * methods - executable code that manipulates state
     * and performs operations
     */
    void addStudent() {
        if (noOfStudents < seats) {
            noOfStudents++; // <=> noOfStudents = noOfStudents + 1;
        }
    }

}
