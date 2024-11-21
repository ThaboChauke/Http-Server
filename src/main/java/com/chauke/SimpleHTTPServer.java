package com.chauke;

import java.io.IOException;
import java.net.ServerSocket;

public class SimpleHTTPServer {

    public static void main(String[] args) throws IOException {

        final int PORT = 8080;
        final ServerSocket server = new ServerSocket(PORT);
        System.out.println("Listening for connection on port " + PORT + "...");
        while (true) {

        }
    }
}
