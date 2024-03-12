package com.mode.design.abstractfactory;

public class Android implements SystemFactory {
    @Override
    public OperationController createOperationController() {
        return new AndroidOperation();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new AndroidInterface();
    }
}
