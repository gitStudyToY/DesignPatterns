package com.mode.design.composite;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Container extends AbstractComponent {

    private List<AbstractComponent> components = new ArrayList<>();
    private String name;
    public Container(String name){
        this.name = name;
    }
    @Override
    public void display() {
        for (AbstractComponent component : components) {
            component.display();
        }
    }
    public void addComponent(AbstractComponent component) {
        components.add(component);
    }
    public void removeComponent(AbstractComponent component) {
        components.remove(component);
    }
    public AbstractComponent getChild(int i) {
        return components.get(i);
    }
}
