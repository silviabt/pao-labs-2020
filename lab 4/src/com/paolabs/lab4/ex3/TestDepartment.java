package com.paolabs.lab4.ex3;

public class TestDepartment {

    public static void main(String[] args) {
        Student s1 = new Student("Silvia", "Butan", 7);
        Student s2 = new Student("Maria", "Popescu", 8);

        Student[] students = {s1, s2};

        Department department = new Department("IT", students);

        System.out.println(department.getName());
        System.out.println(department.getStudents().length);
    }
}
