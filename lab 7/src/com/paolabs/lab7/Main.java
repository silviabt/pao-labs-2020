package com.paolabs.lab7;

import com.paolabs.lab7.ex1.*;

public class Main {

    public static void main(String[] args) {
        ArrayListExamples arrayListExamples = ArrayListExamples.getInstance();
        arrayListExamples.addNameElement("Silvia");
        arrayListExamples.addNameElement("John");
        arrayListExamples.addNameElement("Doe");

        arrayListExamples.removeNameElement(2);
        arrayListExamples.updateNameElement(1, "Mark");

        arrayListExamples.yetAnotherDisplayList();

        LinkedListExample linkedListExample = LinkedListExample.getInstance();
        linkedListExample.addElement("Silvia1");
        linkedListExample.addElement("Silvia3");
        linkedListExample.addElement("Silvia2");

        System.out.println(linkedListExample.getElementAtIndex(2));
        linkedListExample.reverseOrder();
        linkedListExample.displayLinkedList();

        HashSetExample hashSetExample = HashSetExample.getInstance();
        hashSetExample.addElement("el1");
        hashSetExample.addElement("el2");
        String el3 = "el3";
        hashSetExample.addElement(el3);

        System.out.println(hashSetExample.containsElement("el1"));
        System.out.println(hashSetExample.containsElement(el3));

        hashSetExample.anotherDisplayElements();

        HashMapExample hashMapExample = HashMapExample.getInstance();
        hashMapExample.addElement(1, "el1");
        hashMapExample.addElement(2, "el2");
        hashMapExample.addElement(13, "el3");
        hashMapExample.addElement(13, "el4");

        hashMapExample.anotherDisplayMap();

        DequeExample dequeExample = DequeExample.getInstance();
        dequeExample.addElement("el14");
        dequeExample.addElement("el24");
        dequeExample.addElement("el34");
        dequeExample.addElement("el44");

        dequeExample.display();
        dequeExample.displayReverse();
    }
}
