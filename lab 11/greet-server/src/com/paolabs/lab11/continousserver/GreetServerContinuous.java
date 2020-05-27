package com.paolabs.lab11.continousserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class GreetServerContinuous {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter printWriter;
    private BufferedReader bufferedReader;

    public void startServer(int port) {
        try {
            serverSocket = new ServerSocket(port);
            clientSocket = serverSocket.accept();
            printWriter = new PrintWriter(clientSocket.getOutputStream(), true);
            bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String inputLine;
            while ((inputLine = bufferedReader.readLine()) != null) {
                if (".".equals(inputLine)) {
                    printWriter.println("good bye");
                    break;
                }
                printWriter.println("hello client");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void stopServer() {
        try {
            printWriter.close();
            bufferedReader.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
