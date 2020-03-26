package com.paolabs.lab5.ex1;

public class Exemplul2 implements InterfaceExemplul1, InterfaceExemplul2 {

    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

    @Override
    public void sayBye() {
        System.out.println("Bye!");
    }
}
