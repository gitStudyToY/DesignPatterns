package com.mode.design.chainofresponsibility;

public class GeneralManager extends Approver {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void processRequest(Note note) {
        if (note.getDays() >= 10 && note.getDays() < 30) {
            System.out.println("总经理审批假条：" + note.getPerson() + "-" + note.getContent() + "-" + note.getDays());
        }else {
            System.out.println("请假时间过长，请分阶段请假！");
        }
    }
}
