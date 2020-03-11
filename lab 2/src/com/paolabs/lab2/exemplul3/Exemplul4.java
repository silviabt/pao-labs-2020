package com.paolabs.lab2.exemplul3;

public class Exemplul4 {

    public static void main(String args[]) {

        // Classes are reference types
        Timetable uniBucTimetable = new Timetable();
        Timetable poliTimeTable = new Timetable();

        poliTimeTable.addStudent();
        System.out.println(poliTimeTable.noOfStudents); // => 1

        poliTimeTable = uniBucTimetable;
        System.out.println(poliTimeTable.noOfStudents); // => 0

        uniBucTimetable.addStudent();
        uniBucTimetable.addStudent();

        System.out.println(poliTimeTable.noOfStudents); // => 2
    }
}
