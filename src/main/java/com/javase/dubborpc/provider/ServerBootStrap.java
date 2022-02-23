package com.javase.dubborpc.provider;

import com.javase.dubborpc.netty.NettyServer;

/**
 * @author: Admin
 * @create: 2020/12/23 19:31
 */
//启动一个NettyServer
public class ServerBootStrap {

    public static void main(String[] args) throws Exception {
        NettyServer.startServer("127.0.0.1",7000);
    }
}
