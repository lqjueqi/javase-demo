package com.javase.dubborpc.netty;

import com.javase.socket.netty.simple.NettyClientHandler;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

import java.lang.reflect.Proxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: Admin
 * @create: 2020/12/23 19:30
 */
public class NettyClient {

    private static ExecutorService executor = Executors.
            newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    private static MyClientHandler clientHandler;

    private int count = 0;

    //使用代理模式创建对象

    public Object getBean(final Class<?> className, final String pName) {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                new Class<?>[]{className}, (proxy, method, args) -> {

                    System.out.println("(proxy, method, args) 进入...." + (++count) + " 次");
                    if (clientHandler == null) {
                        initClient();
                    }
                    //设置发给服务器信息 pName协议头 args[0] 参数
                    clientHandler.setParam(pName + args[0]);
                    return executor.submit(clientHandler).get();
                });
    }

    public static void initClient() {
        clientHandler = new MyClientHandler();
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(group)
                    .channel(NioSocketChannel.class)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ChannelPipeline pipeline = ch.pipeline();
                            pipeline.addLast(new StringDecoder());
                            pipeline.addLast(new StringEncoder());
                            pipeline.addLast(clientHandler);
                        }
                    });
            bootstrap.connect("127.0.0.1", 7000).sync();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
