package com.mode.design.builder;

public class Element {

    private String menu;
    private String playlist;
    private String mainWindow;
    private String controlBar;
    private String favortiesList;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    public String getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(String mainWindow) {
        this.mainWindow = mainWindow;
    }

    public String getControlBar() {
        return controlBar;
    }

    public void setControlBar(String controlBar) {
        this.controlBar = controlBar;
    }

    public String getFavortiesList() {
        return favortiesList;
    }

    public void setFavortiesList(String favortiesList) {
        this.favortiesList = favortiesList;
    }
}
