package com.mode.design.client;

import com.mode.design.abstractfactory.InterfaceController;
import com.mode.design.abstractfactory.OperationController;
import com.mode.design.abstractfactory.SystemFactory;
import com.mode.design.factorymethod.PictureFactory;
import com.mode.design.factorymethod.PictureReader;
import com.mode.design.util.XMLUtil;

public class AbstractFactoryClient {
    public static void main(String[] args) {

        SystemFactory type = (SystemFactory) XMLUtil.getSystem();
        OperationController operationController = type.createOperationController();
        InterfaceController interfaceController = type.createInterfaceController();
        operationController.write();
        interfaceController.write();
    }
}
