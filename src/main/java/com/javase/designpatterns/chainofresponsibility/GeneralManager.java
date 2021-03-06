package com.javase.designpatterns.chainofresponsibility;

/**
 * @author: Admin
 * @create: 2020/8/22 23:15
 */
public class GeneralManager extends Leader {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 30) {
            System.out.println("员工：" + request.getEmpName() + "请假，天数：" + request.getLeaveDays() + "，理由：" + request.getReason());
            System.out.println("总经理：" + this.name + "，审批通过！");
        } else {
            System.out.println("莫非" + request.getEmpName() + "想辞职，居然请假" + request.getLeaveDays() + "天！");
        }
    }
}
