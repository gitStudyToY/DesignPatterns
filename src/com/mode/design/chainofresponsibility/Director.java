package com.mode.design.chainofresponsibility;

public class Director extends Approver {
    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(Note note) {
        if (note.getDays() < 3) {
            System.out.println("经理审批假条：" + note.getPerson() + "-" + note.getContent() + "-" + note.getDays() );
        }else{
            this.successor.processRequest(note);
        }

    }
}
