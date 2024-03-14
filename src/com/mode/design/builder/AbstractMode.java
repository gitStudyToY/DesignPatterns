package com.mode.design.builder;

public abstract class AbstractMode {
    public Element element = new Element();
    public abstract  void builderMenu();
    public abstract  void builderPlaylist();
    public abstract  void builderMainWindow();
    public abstract  void builderControlBar();
    public abstract  void builderFavortiesList();
    public Element createElement() {
        return element;
    }
    public boolean isMenu(){
        return false;
    }
    public boolean isPlayList(){
        return false;
    }
    public boolean isMainWindow(){
        return false;
    }
    public boolean isControlBar(){
        return false;
    }
    public boolean isFavortiesList(){
        return false;
    }

}
