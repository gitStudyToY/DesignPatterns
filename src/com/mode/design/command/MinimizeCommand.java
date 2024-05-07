package com.mode.design.command;

public class MinimizeCommand extends Command {
    private WindowHandler windowHandler;
    public MinimizeCommand(){
        windowHandler = new WindowHandler();
    }
    @Override
    public void execute() {
        windowHandler.minmize();
    }
}
