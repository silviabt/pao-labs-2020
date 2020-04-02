package com.paolabs.lab6.ex2;

import java.io.*;

public class WriteToFileService {

    public static void writeUsingFileOutputStream(String text) throws DocumentedException {
        try (FileOutputStream out = new FileOutputStream("output.txt")) {
            out.write(text.getBytes());
        } catch (IOException e) {
            throw new DocumentedException("Something went wrong in writeUsingFileOutputStream method", e);
        }
    }

    public static void writeUsingFileWriter(String text) throws DocumentedException {
        try (FileWriter fileWriter = new FileWriter("output.txt")) {
            fileWriter.write(text);
            fileWriter.append("-");
        } catch (IOException e) {
            throw new DocumentedException("Something went wrong in writeUsingFileWriter method", e);
        }
    }

    public static void createDirectory(String dirName) throws DocumentedException {
        File dir = new File(dirName);
        boolean mkdir = dir.mkdir();
        if (mkdir) {
            System.out.println("Directory: " + dirName + " created");
        } else {
            throw new DocumentedException("Something went wrong in createDirectory method");
        }
    }

    public static void writeUsingDataOutputStream(String text) throws DocumentedException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("output.txt"))) {
            dataOutputStream.write(text.getBytes());
        } catch (IOException e) {
            throw new DocumentedException("Something went wrong in writeUsingDataOutputStream method");
        }
    }

    public static void writeUsingBufferedOutputStream(String text) throws DocumentedException {
        try (BufferedOutputStream output = new BufferedOutputStream(
                new FileOutputStream("output.txt"))) {
            output.write(text.getBytes());
        } catch (IOException e) {
            throw new DocumentedException("Something went wrong in writeUsingBufferedOutputStream method");
        }
    }

    public static void writeUsingBufferedWriter(String text) {
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter("output.txt"))) {
            buffer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
