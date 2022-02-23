package com.javase.dubborpc.comsumer;


import com.javase.dubborpc.commons.HelloService;
import com.javase.dubborpc.netty.NettyClient;
import com.javase.dubborpc.netty.NettyClient01;

/**
 * @author: Admin
 * @create: 2020/12/23 19:31
 */
public class ClientBootStrap {

    public static final String pName = "HelloService#hello#";

    public static void main(String[] args) throws Exception {
        NettyClient01 customer = new NettyClient01();
        //创建代理对象
        HelloService service = (HelloService) customer.getBean(HelloService.class, pName);
        for (;; ) {
            Thread.sleep(2 * 1000);
            //通过代理对象调用服务提供者的方法(服务)
            String res = service.hello("你好 dubbo~");
            System.out.println("调用的结果 res= " + res);
        }
    }
}
