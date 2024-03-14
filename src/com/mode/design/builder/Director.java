package com.mode.design.builder;

public class Director {

    public Element construct(AbstractMode abstractMode){
        Element element;
        if(abstractMode.isMenu()){
            abstractMode.builderMenu();
        }
        if (abstractMode.isControlBar()){
            abstractMode.builderControlBar();
        }
        if(abstractMode.isFavortiesList()) {
            abstractMode.builderFavortiesList();
        }
        if(abstractMode.isMainWindow()) {
            abstractMode.builderMainWindow();
        }
        if(abstractMode.isPlayList()) {
            abstractMode.builderPlaylist();
        }
        element = abstractMode.createElement();
        return element;

    }
}
