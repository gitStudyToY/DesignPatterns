package com.mode.design.client;

import com.mode.design.chainofresponsibility.*;

/**
 * @author Administrator
 */
public class ChainOfResponsibilityClient {
    public static void main(String[] args) {
        Approver director,manager,generalManager;
        director = new Director("张三");
        manager = new Manager("李四");
        generalManager = new GeneralManager("王五");

        //c创建职责链
        director.setSuccessor(manager);
        manager.setSuccessor(generalManager);

        //请假
        Note note = new Note("家中有事","小明",2);
        director.processRequest(note);
        Note note1 = new Note("家中有事","小明",4);
        director.processRequest(note1);
        Note note2 = new Note("家中有事","小明",23);
        director.processRequest(note2);
        Note note3 = new Note("家中有事","小明",45);
        director.processRequest(note3);
    }
}
