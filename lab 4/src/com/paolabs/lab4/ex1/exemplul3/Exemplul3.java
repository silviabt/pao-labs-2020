package com.paolabs.lab4.ex1.exemplul3;

public class Exemplul3 {

    public static void main(String[] args) {
        // dynamic polymorphism
        Shape shape = new Shape();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        Shape ref;

        ref = shape;
        ref.draw();
        ref.delete();

        ref = circle;
        ref.draw();
        ref.delete();

        ref = triangle;
        ref.draw();
        ref.delete();

    }

}
