package com.paolabs.lab6.ex1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileService {

    public static void write() throws FileNotFoundException {
        FileOutputStream outputStream = new FileOutputStream("ex1.txt");
        //todo
    }

    public static void writeToFile() {
        try {
            FileOutputStream outputStream = new FileOutputStream("ex1.txt");
            //todo write to file
        } catch (FileNotFoundException e) {
            //todo handle the exception
        }
    }

    public static void writeToFileAndPrintInfo() {
        try {
            FileOutputStream outputStream = new FileOutputStream("ex1.txt");
            //todo write to file
        } catch (FileNotFoundException e) {
            //todo handle the exception
        } finally {
            System.out.println("This is some info");
        }
    }

    public static void writeNumberToFile() {
        try {
            FileOutputStream outputStream = new FileOutputStream("ex1.txt");
            outputStream.write(String.valueOf(53).getBytes());
        } catch (FileNotFoundException e) {
            //todo handle FileNotFoundException exception
        } catch (IOException e) {
            //todo handle IOException exception
        } finally {
            System.out.println("This is some info");
        }
    }

    public static void writeTextToFile() {
        try {
            FileOutputStream outputStream = new FileOutputStream("ex1.txt");
            int number = Integer.parseInt("2f5");
            outputStream.write(String.valueOf(number).getBytes());
        } catch (IOException | NumberFormatException e) {
            //todo handle exception
        } finally {
            System.out.println("This is some info");
        }
    }

    public static void writeGrades(Object o) throws AccessDeniedException {
        if (o instanceof Student) {
            throw new AccessDeniedException("Access denied for students");
        } else if (o instanceof Professor) {
            // todo write grades
        }
    }

    public static void readFromFile(String file) {
        if (file.isBlank() || file.isEmpty()) {
            throw new IllegalArgumentException("Filename isn't valid!");
        }
        //todo
    }

    public static void writeInfoToFile() throws FileNotFoundException {
        try {
            FileOutputStream outputStream = new FileOutputStream("ex1.txt");
            // todo
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void writeSomethingToFile() throws AccessDeniedException {
        try {
            FileOutputStream outputStream = new FileOutputStream("ex1.txt");
            // todo
        } catch (FileNotFoundException e) {
            throw new AccessDeniedException(e.getMessage());
        }
    }

    public static void addGrade() {
        //todo add grade
        try {
            throw new NullPointerException();
        } catch (Throwable t) {
            throw t;
        }
    }

    // anti pattern - swallowing Exceptions
    public static void writeTimetable() {
        try {
            FileOutputStream outputStream = new FileOutputStream("ex1.txt");
            // todo
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // anti pattern - return in finally block
    public static boolean getGrade() {
        try {
            FileOutputStream outputStream = new FileOutputStream("ex1.txt");
            // todo
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            return false;
        }
    }

    // anti pattern - throw in finally block
    public static boolean getGrades() throws AccessDeniedException {
        try {
            FileOutputStream outputStream = new FileOutputStream("ex1.txt");
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            throw new AccessDeniedException("there is a problem");
        }
    }

}
