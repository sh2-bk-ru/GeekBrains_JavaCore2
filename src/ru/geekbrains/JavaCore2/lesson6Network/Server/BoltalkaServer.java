package ru.geekbrains.JavaCore2.lesson6Network.Server;

import ru.geekbrains.JavaCore2.lesson6Network.AuthService.AuthService;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;

public class BoltalkaServer {
    private Vector<ClientHandler> clients;

    public BoltalkaServer(){
        ServerSocket server = null;
        Socket socket = null;
        clients = new Vector<>();

        try {
            AuthService.connect();

            System.out.println(AuthService.getNickByLoginAndPass("log1", "pass1"));
            server = new ServerSocket(8189);
            System.out.println("Сервер Болталки запущен");

            while(true) {
                socket = server.accept();
                System.out.println("Клиент подключился");
                clients.add(new ClientHandler(socket, this));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e){
                e.printStackTrace();
            }
            AuthService.disconnect();
        }
    }

    public void broadcastMsg(String msg) {
        for (ClientHandler o: clients) {
            o.sendMsg(msg);
        }
    }

}
