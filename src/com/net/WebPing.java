package com.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/*
使用 Socket 连接到指定主机
 */
public class WebPing {
    public static void main(String[] args) throws IOException {
        try {
            Socket socket = new Socket("127.0.0.1", 80);
            InetAddress adr;
            adr = socket.getInetAddress();
            System.out.println("连接到；" + adr);
            socket.close();
        }catch (java.io.IOException e){
                System.out.println("无法连接"+args[0]);
                System.out.println(e);
        }
    }
}
