package com.mode.design.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能键设置窗口类
 */
public class FBSettingWindow {
    /**
     * 窗口标题
     */
    private String title;
    /**
     * 所有功能键
     */
    private List<FunctionButton> functionButtonList = new ArrayList<>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton fb) {
        functionButtonList.add(fb);
    }

    public void removeFunctionButton(FunctionButton fb) {
        functionButtonList.remove(fb);
    }

    public void display(){
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");
        for(FunctionButton obj : functionButtonList) {
            System.out.println(obj.getName());
        }
        System.out.println("========================");
    }

}
