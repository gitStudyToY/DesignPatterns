package com.mode.design.abstractfactory;

public interface SystemFactory {

    OperationController createOperationController();

    InterfaceController createInterfaceController();

}
