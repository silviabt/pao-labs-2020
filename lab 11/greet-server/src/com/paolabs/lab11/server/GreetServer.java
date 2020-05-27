package com.paolabs.lab11.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class GreetServer {

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

            String greeting = bufferedReader.readLine();
            if ("hello server".equals(greeting)) {
                printWriter.println("hello client");
            } else {
                printWriter.println("unrecognised greeting");
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
