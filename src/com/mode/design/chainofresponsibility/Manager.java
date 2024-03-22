package com.mode.design.chainofresponsibility;

public class Manager extends Approver{


    public Manager(String name) {
        super(name);
    }

    @Override
    public void processRequest(Note note) {
        if (note.getDays() >=3 && note.getDays() < 10 ){
            System.out.println("经理审批假条：" + note.getPerson() + "-" + note.getContent() + "-" + note.getDays());
        }else{
            this.successor.processRequest(note);
        }
    }
}
