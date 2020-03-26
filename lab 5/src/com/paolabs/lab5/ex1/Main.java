package com.paolabs.lab5.ex1;

import com.paolabs.lab5.ex1.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(InterfaceExemplul1.hello);

        Exemplul1 exemplul1 = new Exemplul1();
        exemplul1.sayHello();

        InterfaceExemplul1 interfaceExemplul1 = new Exemplul1();
        interfaceExemplul1.sayHello();

        Exemplul3 exemplul3 = new Exemplul3();
        exemplul3.sayHello();

        InterfaceExemplul4.print("Hello!");
    }
}
