package com.paolabs.lab11.multiserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class GreetClientHandler extends Thread {
    private Socket clientSocket;

    public GreetClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    public void run() {
        try {
            PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String inputLine;
            while ((inputLine = bufferedReader.readLine()) != null) {
                if (".".equals(inputLine)) {
                    printWriter.println("good bye");
                    break;
                }
                printWriter.println("hello client");
            }

            bufferedReader.close();
            printWriter.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
