package com.mode.design.chainofresponsibility;

public class Note {

    private String content;
    private String person;
    private int days;

    public Note(String content,String person,int days) {
        this.content = content;
        this.person = person;
        this.days = days;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
