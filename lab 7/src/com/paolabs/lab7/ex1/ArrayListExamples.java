package com.paolabs.lab7.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExamples {

    private static ArrayListExamples instance = new ArrayListExamples();

    //Empty ArrayList
    private final List<String> names = new ArrayList<>();

    private ArrayListExamples() {
    }

    public static ArrayListExamples getInstance() {
        return instance;
    }

    public void addNameElement(String name) {
        // add elements to the list
        names.add(name);
    }

    public void removeNameElement(int index) {
        // remove element with given index from the list
        names.remove(index);
    }

    public void updateNameElement(int index, String name) {
        // update element at given index with given value
        names.set(index, name);
    }

    public void displayList() {
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void anotherDisplayList() {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public void yetAnotherDisplayList() {
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
