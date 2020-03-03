package com.paolabs;

public class Exemplul6 {

    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';

        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        Integer i1 = Integer.valueOf(2);
        double i1DoubleValue = i1.doubleValue();
        int i1IntValue = i1.intValue();
    }
}
