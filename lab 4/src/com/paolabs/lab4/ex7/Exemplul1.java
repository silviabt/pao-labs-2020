package com.paolabs.lab4.ex7;

public class Exemplul1 {

    public static void main(String[] args) {
        Age age = new Age(1,1,1992);
        ImmutableStudent student = new ImmutableStudent(1, "Silvia", age);
        System.out.println("Silvia age year before modification = " + student.getAge().getYear());
        age.setYear(1993);
        System.out.println("Silvia age year after modification = " + student.getAge().getYear());
    }

}
