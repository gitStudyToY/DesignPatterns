package com.mode.design.command;

/**
 * 加法类：请求接收者
 */
public class Adder {
    /**
     * 定义初始值为0
     */
    private int num = 0;

    /**
     * 加法操作，每次将输入的值与num相加，再将结果返回
     * @param value
     * @return
     */
    public int add(int value) {
        num += value;
        return num;
    }
}
