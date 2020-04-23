package com.paolabs.lab7.ex1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    private static HashSetExample instance = new HashSetExample();

    private final HashSet<String> hashSet = new HashSet<>();

    private HashSetExample() {
    }

    public static HashSetExample getInstance() {
        return instance;
    }

    public void addElement(String element) {
        hashSet.add(element);
    }

    public void removeElement(String element) {
        hashSet.remove(element);
    }

    public boolean containsElement(String element) {
        return hashSet.contains(element);
    }

    public void displayElements() {
        Iterator<String> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            String value = iterator.next();

            System.out.println("Value: " + value);
        }
    }

    public void anotherDisplayElements() {
        for (String value : hashSet) {
            System.out.println("Value: " + value);
        }
    }

    public String[] convertHashSetToArray() {
        String[] newArray = new String[hashSet.size()];
        return hashSet.toArray(newArray);
    }

}
