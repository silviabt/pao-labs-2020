package com.paolabs.lab11.server;

public class Main {

    public static void main(String[] args) {
        GreetServer server = new GreetServer();
        server.startServer(8081);
    }
}
