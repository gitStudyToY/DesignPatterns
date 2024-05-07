package com.mode.design.client;

import com.mode.design.command.*;
import com.mode.design.util.XMLUtil;

public class CommandClient {

    public static void main(String[] args) {
//        CalculatorForm calculatorForm = new CalculatorForm();
//        AbstractCommand command;
//        command = new ConcreteCommand();
//        calculatorForm.setCommand(command);
//        calculatorForm.compute(10);
//        calculatorForm.compute(4);
//        calculatorForm.compute(56);
//        calculatorForm.undo();
//        calculatorForm.undo();
//        calculatorForm.redo();
//        calculatorForm.redo();

        FBSettingWindow fbsw = new FBSettingWindow("功能键设置");
        FunctionButton b1,b2;
        b1 = new FunctionButton("功能键1");
        b2 = new FunctionButton("功能键2");
        Command c1,c2;
        c1 =(Command) XMLUtil.getCommand(0);
        c2 = (Command)XMLUtil.getCommand(1);

        b1.setCommand(c1);
        b2.setCommand(c2);

        fbsw.addFunctionButton(b1);
        fbsw.addFunctionButton(b2);
        fbsw.display();

        b1.onClick();
        b2.onClick();
    }
}
