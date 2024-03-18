package com.mode.design.composite;

public class Button extends AbstractComponent {
    private String name;
    public Button(String name) {
        this.name = name;
    }
    @Override
    public void display() {
        System.out.println(this.name);
    }
}
