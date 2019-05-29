package ru.geekbrains.JavaCore2.lesson6Network.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler {
    private DataInputStream in;
    private DataOutputStream out;
    private Socket socket;
    private BoltalkaServer server;

    public ClientHandler(Socket socket, BoltalkaServer server) {
        try {
            this.socket = socket ;
            this.server = server ;
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true){
                            String str = in.readUTF();
                            if(str.startsWith("/auth")){
                                String[] tokens = str.split(" ")
                            }

                        }

                        while(true) {
                            String str = in.readUTF();
                            if(str.equals("/end")) {
                                break;
                            }
                            //out.writeUTF("Client: " + str + " echo!");
                            server.broadcastMsg("Client: " + str);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            in.close();
                        } catch (IOException e){
                            e.printStackTrace();
                        }
                        try {
                            out.close();
                        } catch (IOException e){
                            e.printStackTrace();
                        }
                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMsg(String msg) {
        try {
            out.writeUTF(msg);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
