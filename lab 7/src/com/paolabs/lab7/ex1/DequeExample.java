package com.paolabs.lab7.ex1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeExample {

    private static DequeExample instance = new DequeExample();

    Deque<String> deque = new ArrayDeque<>();

    private DequeExample() {
    }

    public static DequeExample getInstance() {
        return instance;
    }

    public void addElement(String element) {
        deque.add(element);
    }

    public void addFirst(String element) {
        deque.addFirst(element);
    }

    public void addLast(String element) {
        deque.addLast(element);
    }

    public void display() {
        for (Iterator<String> iterator = deque.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }

    public void anotherDisplay() {
        for (String s : deque) {
            System.out.println(s);
        }
    }

    public void displayReverse() {
        for (Iterator<String> dItr = deque.descendingIterator(); dItr.hasNext(); ) {
            System.out.println(dItr.next());
        }
    }

    public void anotherDisplayReverse() {
        Iterator<String> dItr = deque.descendingIterator();
        while (dItr.hasNext()) {
            System.out.println(dItr.next());
        }
    }
}
