package com.mode.design.command;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * 具体命令类
 */
public class ConcreteCommand extends AbstractCommand {
    private Adder adder = new Adder();
    private int value;
    private List<Integer> undoSet = new LinkedList<>();
    private List<Integer> redoSet = new LinkedList<>();
    /**
     * 声明命令执行方法execute()
     *
     * @param value
     * @return
     */
    @Override
    public int execute(int value) {
        this.value = value;
        int rtn = adder.add(value);
        undoSet.add(rtn);
        redoSet.add(rtn);
        return rtn;
    }

    /**
     * 声明撤销方法undo()
     *
     * @return
     */
    @Override
    public int undo() {
        int rtn = undoSet.get(undoSet.size() - 2);
        undoSet.remove(undoSet.size() - 2);
        redoSet.add(rtn);
        return rtn;
    }

    @Override
    public int redo(){
        int rtn = redoSet.get(redoSet.size() - 2);
        redoSet.remove(redoSet.size() - 2);
        undoSet.add(rtn);
        return rtn;
    }


}
