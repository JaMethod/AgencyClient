package net;

import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable{

    private String host;
    private int port;

    public ClientHandler(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public void run() {
        try (
                Socket socket = new Socket(host, port);
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                DataInputStream in = new DataInputStream(socket.getInputStream())
        ) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
