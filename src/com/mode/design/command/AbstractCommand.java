package com.mode.design.command;

/**
 * 抽象命令类
 */
public abstract class AbstractCommand {
    /**
     * 声明命令执行方法execute()
     *  @return
     */
    public abstract int execute(int value);

    /**
     * 声明撤销方法undo()
     * @return
     */
    public abstract int undo();
    /**
     * 声明恢复方法redo()
     * @return
     */
    public abstract int redo();
}
