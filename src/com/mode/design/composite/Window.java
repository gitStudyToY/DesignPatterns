package com.mode.design.composite;

import java.util.ArrayList;
import java.util.List;

public class Window extends AbstractComponent {

    private String name;
    public Window(String name) {
        this.name = name;
    }

    private List<AbstractComponent> componentList = new ArrayList<AbstractComponent>();
    @Override
    public void display() {
        for (AbstractComponent component: componentList) {
            component.display();
        }

    }

    public void addComponent(AbstractComponent component) {
        componentList.add(component);
    }
    public void removeComponent(AbstractComponent component) {
        componentList.remove(component);
    }
    public AbstractComponent getChild(int i) {
        return componentList.get(i);
    }
}
