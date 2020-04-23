package com.paolabs.lab8;

import com.paolabs.lab8.ex1.CustomFI;
import com.paolabs.lab8.ex1.FunctionFIDemo;

public class Main {

    public static void main(String[] args) {
        String stringsBiFunction = FunctionFIDemo.concatStringsBiFunction("Hello ", "World");
        System.out.println(stringsBiFunction);

        int multiplyTwoIntsBiFunction = FunctionFIDemo.multiplyTwoIntsBiFunction(12, 34);
        System.out.println(multiplyTwoIntsBiFunction);

        int toIntFunction = FunctionFIDemo.convertDoubleToIntDoubleToIntFunction(234.5);
        System.out.println(toIntFunction);

        long toLongFunction = FunctionFIDemo.convertDoubleToLongDoubleToLongFunction(234.5);
        System.out.println(toLongFunction);

        String stringDoubleFunction = FunctionFIDemo.convertDoubleToStringDoubleFunction(234.5);
        System.out.println(stringDoubleFunction);


        CustomFI customFI = msg -> System.out.println(msg);
        customFI.hello("Hello everyone!");
    }
}
