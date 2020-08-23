package com.javase.designpatterns.chainofresponsibility;

/**
 * @author: Admin
 * @create: 2020/8/22 23:04
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader; //责任链上的后继对象

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    //处理请求的核心方法
    public abstract void handlerRequest(LeaveRequest request);
}
