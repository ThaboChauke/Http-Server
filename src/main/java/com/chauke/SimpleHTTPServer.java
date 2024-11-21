package com.chauke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class SimpleHTTPServer {

    public static void main(String[] args) throws IOException {

        final int PORT = 8080;
        final ServerSocket server = new ServerSocket(PORT);
        System.out.println("Listening for connection on port " + PORT + "...");

//        while (true) {
//            Socket clientSocket = server.accept();
//            InputStreamReader inputStreamReader = new InputStreamReader(clientSocket.getInputStream());
//            BufferedReader reader = new BufferedReader(inputStreamReader);
//
//            String line = reader.readLine();
//
//            while (!line.isEmpty()) {
//                System.out.println(line);
//                line = reader.readLine();
//            }
//        }

        while (true) {
            try (Socket clientSocket = server.accept()) {
                Date today = new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
                clientSocket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
            }


        }
    }
}
