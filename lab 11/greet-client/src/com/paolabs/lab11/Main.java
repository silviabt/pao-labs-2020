package com.paolabs.lab11;

public class Main {

    public static void main(String[] args) {
        GreetClient client2 = new GreetClient();
        client2.startConnection("127.0.0.1", 8081);
        String response = client2.sendMessage("hello server");
        System.out.println(response);

        String response1 = client2.sendMessage("hello server");
        System.out.println(response1);

        String response2 = client2.sendMessage(".");
        System.out.println(response2);
    }
}
