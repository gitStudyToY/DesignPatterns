package com.mode.design.builder;

public class FullMode extends AbstractMode{

    @Override
    public void builderMenu() {
        element.setMenu("菜单");
    }

    @Override
    public void builderPlaylist() {
        element.setPlaylist("播放列表");
    }

    @Override
    public void builderMainWindow() {
        element.setMainWindow("主窗口");
    }

    @Override
    public void builderControlBar() {
        element.setControlBar("控制条");
    }

    @Override
    public void builderFavortiesList() {
        element.setFavortiesList("收藏列表");
    }

    @Override
    public boolean isMenu(){
        return true;
    }
    @Override
    public boolean isPlayList(){
        return true;
    }
    @Override
    public boolean isMainWindow(){
        return true;
    }
    @Override
    public boolean isControlBar(){
        return true;
    }

}
