package com.javase.socket.protocoltcp;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

/**
 * @author: Admin
 * @create: 2020/11/25 20:44
 */
public class NettyClientHandler extends SimpleChannelInboundHandler<MyMessage> {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("client:" + ctx);
        //ctx.writeAndFlush(Unpooled.copiedBuffer("hello,server: (>^ω^<)喵", CharsetUtil.UTF_8));
        for (int i = 0; i < 10; i++) {
            ctx.writeAndFlush(Unpooled.copiedBuffer("hello,server:" + i, CharsetUtil.UTF_8));
        }
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
//        System.out.println("服务器读取线程：" + Thread.currentThread().getName());
//        ByteBuf buf = (ByteBuf) msg;
//        System.out.println("服务器回复的消息：" + buf.toString(CharsetUtil.UTF_8));
//        System.out.println("服务器的地址：" + ctx.channel().remoteAddress());
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MyMessage msg) throws Exception {

    }


    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println("异常信息：" + cause.getMessage());
        ctx.close();
    }
}
