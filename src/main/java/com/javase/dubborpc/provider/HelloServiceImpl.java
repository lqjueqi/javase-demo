package com.javase.dubborpc.provider;

import com.javase.dubborpc.commons.HelloService;

/**
 * @author: Admin
 * @create: 2020/12/21 21:37
 */
public class HelloServiceImpl implements HelloService {
    private static int count = 0;
    @Override
    public String hello(String msg) {
        System.out.println("收到客户端消息： " + msg);
        if (msg != null) {
            return "你好，客户端。收到你的消息 [" + msg + "]第" + (++count) + " 次";
        } else {
            return "你好，客户端。收到你的消息";
        }
    }
}
