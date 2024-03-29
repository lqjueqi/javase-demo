package com.javase.socket.netty.simple;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

/**
 * @author: Admin
 * @create: 2020/11/25 20:18
 */
public class NettyServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //System.out.println("server tcx=" + ctx);
        //将延时任务加入队列执行
        //ctx.channel().eventLoop().execute();
        //ctx.channel().eventLoop(.schedule();
        //ByteBuf buf = (ByteBuf) msg;
        System.out.println("客户端发送的消息"+msg.toString());
        ctx.writeAndFlush(msg);
        //System.out.println("客户端发送的消息：" + buf.toString(CharsetUtil.UTF_8));
        //System.out.println("客户端地址：" + ctx.channel().remoteAddress());
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.writeAndFlush(Unpooled.copiedBuffer("hello,客户端~", CharsetUtil.UTF_8));
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
