package ru.ifmo.serverapp;

import java.io.*;

public class ServerApplication {
    public static void main(String[] args) {

        SomeInterface<String> someInterface = new SomeInterface<>() {
            @Override
            public void someVoid1(String s) {
                // реализация метода
            }

            @Override
            public String someVoid2() {
                // реализация метода
                return null;
            }
        };

        new Server(8999).start();
    }
}
