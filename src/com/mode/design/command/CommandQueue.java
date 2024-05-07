package com.mode.design.command;

import java.util.ArrayList;
import java.util.List;

public class CommandQueue {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void removeCommand(Command command) {
        commandList.remove(command);
    }

    public void execute(){
        for (Object command : commandList) {
            ((Command)command).execute();
        }
    }
}
