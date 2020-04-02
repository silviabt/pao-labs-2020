package com.paolabs.lab6.ex2;

import java.io.*;

public class ReadFromFileService {

    public static void readUsingFileOutputStream() throws DocumentedException {
        try (FileInputStream in = new FileInputStream("input.txt")) {
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new DocumentedException("Something went wrong in readUsingFileOutputStream method", e);
        }
    }

    public static void readUsingFileReader() throws DocumentedException {
        try (FileReader fileReader = new FileReader("input.txt")) {
            int content;
            while ((content = fileReader.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            throw new DocumentedException("Something went wrong in readUsingFileReader method", e);
        }
    }

    public static void readUsingDataInputStream() throws DocumentedException {
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("input.txt"))) {
            while (dataInputStream.available() > 0) {
                char content = (char) dataInputStream.read();
                System.out.print(content);
            }
        } catch (IOException e) {
            throw new DocumentedException("Something went wrong in readUsingFileReader method", e);
        }
    }

    public static void readUsingBufferedInputStream() throws DocumentedException {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(
                new FileInputStream("input.txt"))) {

            while (bufferedInputStream.available() > 0) {
                int read = bufferedInputStream.read();
                System.out.print((char) read);
            }
        } catch (IOException e) {
            throw new DocumentedException("Something went wrong in readUsingBufferedInputStream method", e);
        }
    }

    public static void readUsingBufferedWriter() {
        try (BufferedReader buffer = new BufferedReader(new FileReader("input.txt"))) {
            String line = buffer.readLine();
            while (line != null) {
                System.out.println(line);
                line = buffer.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
