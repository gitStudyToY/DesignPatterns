package com.mode.design.prototype;

import java.io.Serializable;

/**
 * 浅克隆不需要实现Serializable，深克隆需要实现Serializable
 */
public class Attachment implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download(){
        System.out.println("下载附件，文件名为" + name);
    }
}
