package com.javase.socket.bio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: Admin
 * @create: 2020/8/23 12:02
 */
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket();
        ss.bind(new InetSocketAddress("127.0.0.1", 8888));

        while (true) {
            Socket s = ss.accept();

            new Thread(() -> {
                try {
                    byte[] b = new byte[1024];
                    int len = s.getInputStream().read(b);
                    System.out.println(new String(b, 0, len));

                    s.getOutputStream().write(b, 0, len);
                    s.getOutputStream().flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
