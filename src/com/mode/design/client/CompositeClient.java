package com.mode.design.client;

import com.mode.design.composite.*;

public class CompositeClient {
    public static void main(String[] args) {
        AbstractComponent button1, button2, text1, text2;
        Window windows1, wondows2;
        Container container1, container2;
        button1 = new Button("按钮1");
        button2 = new Button("按钮2");
        text1 = new Text("文本1");
        text2 = new Text("文本2");
        windows1 = new Window("窗口1");
        windows1.addComponent(button1);
        windows1.addComponent(text1);
        wondows2 = new Window("窗口2");
        wondows2.addComponent(button2);
        wondows2.addComponent(text2);
        container1 = new Container("容器1");
        container1.addComponent(button1);
        container1.addComponent(text2);
        container2 = new Container("容器2");
        container2.addComponent(button2);
        container2.addComponent(text1);

        windows1.display();
        wondows2.display();
        container1.display();
        container2.display();

    }
}
