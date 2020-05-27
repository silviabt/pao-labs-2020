package com.paolabs.lab11.continousserver;

public class Main {

    public static void main(String[] args) {
        GreetServerContinuous server = new GreetServerContinuous();
        server.startServer(8081);
    }
}
