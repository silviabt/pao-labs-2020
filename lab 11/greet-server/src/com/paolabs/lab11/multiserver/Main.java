package com.paolabs.lab11.multiserver;

public class Main {

    public static void main(String[] args) {
        GreetMultiServer server = new GreetMultiServer();
        server.startServer(8081);
    }
}
