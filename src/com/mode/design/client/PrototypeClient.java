package com.mode.design.client;

import com.mode.design.prototype.*;

import java.io.IOException;

public class PrototypeClient {
    public static void main(String[] args) {
        WeeklyLog logPrevious,logNew;
        //创建原型对象
        logPrevious = new WeeklyLog();
        //创建附件对象
        Attachment attachment = new Attachment();
        logPrevious.setAttachment(attachment);
        //克隆对象
        logNew = logPrevious.clone();
        //比较周报
        System.out.println("周报是否相同：" + (logPrevious == logNew));
        //比较附件
        System.out.println("附件是否相同：" + (logPrevious.getAttachment() == logNew.getAttachment()));
        WeeklyLogDeep deepPervious,deepNew = null;
        deepPervious = new WeeklyLogDeep();
        deepPervious.setAttachment(attachment);
        try {
            deepNew = deepPervious.deepClone();
        } catch (Exception e) {
            System.out.println("克隆失败！");
        }

        //比较周报
        System.out.println("周报是否相同：" + (deepPervious == deepNew));
        //比较附件
        System.out.println("附件是否相同：" + (deepPervious.getAttachment() == deepNew.getAttachment()));

        //获取原型管理器
        PrototypeManager pm = PrototypeManager.getPrototypeManager();
        OfficialDocument doc1,doc2,doc3,doc4;
        doc1 = pm.getOfficialDocument("far");
        doc1.display();
        doc2 = pm.getOfficialDocument("far");
        doc2.display();
        System.out.println(doc1 == doc2);

        doc3 = pm.getOfficialDocument("srs");
        doc3.display();
        doc4 = pm.getOfficialDocument("srs");
        doc4.display();
        System.out.println(doc3 == doc4);
    }
}
