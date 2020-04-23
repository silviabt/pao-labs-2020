package com.paolabs.lab7.ex1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

    private static LinkedListExample instance = new LinkedListExample();

    //Create linked list
    LinkedList<String> linkedList = new LinkedList<>();

    private LinkedListExample() {
    }

    public static LinkedListExample getInstance() {
        return instance;
    }

    public void addElement(String element) {
        //Add elements
        linkedList.add(element);
    }

    public void removeElementBy(int index) {
        //Remove element by index
        linkedList.remove(index);
    }

    public void removeElementBy(String value) {
        //Remove element by value
        linkedList.remove(value);
    }

    public String getFirst() {
        // Return first element
        return linkedList.getFirst();
    }

    public String getLast() {
        // Return last element
        return linkedList.getLast();
    }

    public String getElementAtIndex(int index) {
        // Return element at index
        return linkedList.get(index);
    }

    public void displayLinkedList() {
        ListIterator<String> iterator = linkedList.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void anotherDisplayLinkedList() {
        for (String s : linkedList) {
            System.out.println(s);
        }
    }

    public String[] getLinkedListAsArray() {
        String[] array = new String[linkedList.size()];
        return linkedList.toArray(array);
    }

    public LinkedList<String> getArrayAsLinkedList(String[] array) {
        LinkedList<String> linkedListNew = new LinkedList<>(Arrays.asList(array));
        return linkedListNew;
    }

    public void sort() {
        Collections.sort(linkedList);
    }

    public void reverseOrder() {
        Collections.sort(linkedList, Collections.reverseOrder());
    }

}
