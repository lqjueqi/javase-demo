package com.javase.socket.netty.simple;

import com.javase.dubborpc.commons.MyMessage;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

/**
 * @author: Admin
 * @create: 2020/11/25 20:44
 */
public class NettyClientHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        //System.out.println("client:" + ctx);
        //ctx.writeAndFlush(Unpooled.copiedBuffer("hello,server: (>^ω^<)喵", CharsetUtil.UTF_8));
        MyMessage message = new MyMessage();
        message.setMethodName("hello");
        ctx.writeAndFlush(message);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //System.out.println("服务器读取线程：" + Thread.currentThread().getName());
        //ByteBuf buf = (ByteBuf) msg;
        //System.out.println("服务器回复的消息：" + buf.toString(CharsetUtil.UTF_8));
        System.out.println("服务器回复的消息"+msg.toString());
        //System.out.println("服务器的地址：" + ctx.channel().remoteAddress());
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
