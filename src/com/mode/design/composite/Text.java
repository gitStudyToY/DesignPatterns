package com.mode.design.composite;

public class Text extends AbstractComponent {
    private String name;
    public Text(String name) {
        this.name = name;
    }
    @Override
    public void display() {
        System.out.println(this.name);
    }
}
