package ru.ifmo.clientapp;

public class ClientApplication {
    public static void main(String[] args) {
        new Client("127.0.0.1", 8999).start();
    }
}