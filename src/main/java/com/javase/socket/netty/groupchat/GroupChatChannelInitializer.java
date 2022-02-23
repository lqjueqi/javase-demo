package com.javase.socket.netty.groupchat;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;

/**
 * @author: Admin
 * @create: 2020/12/5 16:18
 */
public class GroupChatChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        //http编解码
        pipeline.addLast(new HttpServerCodec());
        //http以块方式写
        pipeline.addLast(new ChunkedWriteHandler());
        //聚合多个段
        pipeline.addLast(new HttpObjectAggregator(8192));
        //WebSocket数据以帧（frame）形式传递，WebSocketFrame. ws://localhost:7001/hello
        //WebSocketServerProtocolHandler核心功能 将http协议升级为ws协议，保持长连接
        pipeline.addLast(new WebSocketServerProtocolHandler("/hello"));

        pipeline.addLast(new GroupChatChannelHandler());
    }
}
