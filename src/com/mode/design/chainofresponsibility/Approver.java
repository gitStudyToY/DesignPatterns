package com.mode.design.chainofresponsibility;

public abstract class Approver {

    protected String name;
    protected Approver successor;
    public Approver(String name){
        this.name = name;
    }
    //设置后继者
    public void setSuccessor(Approver approver) {
        this.successor = approver;
    }
    //抽象请求方法
    public abstract void processRequest(Note note) ;

}
