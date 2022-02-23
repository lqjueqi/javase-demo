package com.javase.dubborpc.netty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.util.concurrent.Callable;

/**
 * @author: Admin
 * @create: 2020/12/24 21:16
 */
public class MyClientHandler extends ChannelInboundHandlerAdapter implements Callable {

    private ChannelHandlerContext context;
    private String result;//返回结果
    private String param;//客户端传入参数

    //1与服务器连接创建后调用
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println(" channelActive 被调用  ");
        context = ctx;
    }
    //4
    @Override
    public synchronized void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println(" channelRead 被调用  ");
        result = msg.toString();
        notify();//唤醒等待的线程
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }

    //3 5被代理对象调用，发送数据给客户端，-> wait -> 等待被唤醒 -> 返回结果
    @Override
    public synchronized Object call() throws Exception {
        System.out.println(" call1 被调用  ");
        context.writeAndFlush(param);
        wait();//等待channelRead 获取服务器结果后， 唤醒
        System.out.println(" call2 被调用  ");
        return result;
    }
    //2
    void setParam(String param){
        System.out.println(" setPara  ");
        this.param = param;
    }
}
