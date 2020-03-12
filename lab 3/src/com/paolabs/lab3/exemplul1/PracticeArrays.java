package com.paolabs.lab3.exemplul1;

import java.util.Arrays;

public class PracticeArrays {

    public static void main(String[] args) {

        // sort
        float[] values = new float[3];

        values[0] = 10.0f;
        values[1] = 20.0f;
        values[2] = 15.0f;

        Arrays.sort(values);

        System.out.println("The values sorted in ascending order: ");

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        // equals
        long[] array1 = {12L, 56L, 9999L};
        long[] array2 = {1L, 2L, 3L};

        boolean equals = Arrays.equals(array1, array2);
        System.out.println("The arrays are equal? " + equals);

        System.out.println("The arrays are equal? " + Arrays.equals(array1, array1));

        // binary search
        int valSearched1 = Arrays.binarySearch(values, 10.0f);
        int valSearched2 = Arrays.binarySearch(values, 11.0f);

        System.out.println("First value searched: " + valSearched1);
        System.out.println("Second value searched: " + valSearched2);

        // fill
        int[] arraytoBeFilled = new int[5];
        Arrays.fill(arraytoBeFilled, 7);

        for (int i = 0; i < arraytoBeFilled.length; i++) {
            System.out.print(arraytoBeFilled[i]);
        }

    }
}
