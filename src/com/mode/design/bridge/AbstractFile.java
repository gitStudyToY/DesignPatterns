package com.mode.design.bridge;

public abstract class AbstractFile {

    protected Database database;

    public void setDatabase(Database database){
        this.database = database;
    }

    public abstract void trans();
}
