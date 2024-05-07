package com.mode.design.command;

/**
 * 功能键类：请求发送者
 */
public class FunctionButton {
    public FunctionButton(String name){
        this.name = name;
    }
    /**
     * 功能键名称
     */
    private String name;
    /**
     * 维持一个抽象命令对象的引用
     */
    private Command command;

    public String getName() {
        return name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void onClick(){
        System.out.println("点击功能键：" );
        command.execute();
    }
}
