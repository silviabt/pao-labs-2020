package com.paolabs.lab11.multiserver;

import java.io.IOException;
import java.net.ServerSocket;


public class GreetMultiServer {

    private ServerSocket serverSocket;

    public void startServer(int port) {
        try {
            this.serverSocket = new ServerSocket(port);
            while (true) {
                GreetClientHandler clientHandler = new GreetClientHandler(this.serverSocket.accept());
                clientHandler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stopServer() {
        try {
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
