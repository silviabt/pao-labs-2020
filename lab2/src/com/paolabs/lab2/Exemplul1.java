package com.paolabs.lab2;

public class Exemplul1 {

    public static void main(String[] args) {
        // Arrays - provide an ordered collection of elements
        float[] values = new float[3];
        // square bracket right after float indicates that we're declaring values as an array that allocates out a name that can access the array
        // we use the keyword "new" and then float[3] to allocate space to store 3 float values, accessible under the name, values
        // each element is accessed via an index - and indexes range from 0 to number of elements in the array minus 1
        values[0] = 10.0f; // this stores 10.0 in the zero position
        values[1] = 20.0f;
        values[2] = 15.0f;

        // go through the values array and add everything up
        float sum = 0.0f; // allocate some space to store the result called sum.

        // arrays makes it very easy to move through these values using loops
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        System.out.println(sum);
    }
}
