package com.mode.design.abstractfactory;

public class Symbian implements SystemFactory {
    @Override
    public OperationController createOperationController() {
        return new SymbianOperation();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new SymbianInterface();
    }
}
