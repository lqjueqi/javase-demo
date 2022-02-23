package com.javase.socket.protocoltcp;

/**
 * @author: Admin
 * @create: 2020/12/14 19:04
 */
public class MyMessage {
    private int len;
    private byte[] context;

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public byte[] getContext() {
        return context;
    }

    public void setContext(byte[] context) {
        this.context = context;
    }
}
