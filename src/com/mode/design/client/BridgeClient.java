package com.mode.design.client;

import com.mode.design.bridge.AbstractFile;
import com.mode.design.bridge.Database;
import com.mode.design.builder.AbstractMode;
import com.mode.design.builder.Director;
import com.mode.design.builder.Element;
import com.mode.design.util.XMLUtil;

import java.util.Calendar;
import java.util.Date;

public class BridgeClient {

    public static void main(String[] args) {
        AbstractFile file = (AbstractFile) XMLUtil.getBriage("file");
        Database database = (Database) XMLUtil.getBriage("database");

        file.setDatabase(database);
        file.trans();

    }
}
