package com.paolabs.lab7.ex1;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {

    private static HashMapExample instance = new HashMapExample();

    private final HashMap<Integer, String> map = new HashMap<>();

    private HashMapExample() {
    }

    public static HashMapExample getInstance() {
        return instance;
    }

    public void addElement(Integer key, String value) {
        map.put(key, value);
    }

    public String getElementBy(Integer key) {
        return map.get(key);
    }

    public String removeElementBy(Integer key) {
        return map.remove(key);
    }

    public void displayMap() {
        Iterator<Integer> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            Integer key = iterator.next();
            String value = map.get(key);

            System.out.println("The key is :: " + key + ", and value is :: " + value);
        }
    }

    public void anotherDisplayMap() {
        for (Integer key : map.keySet()) {
            String value = map.get(key);

            System.out.println("The key is :: " + key + ", and value is :: " + value);
        }
    }
}
