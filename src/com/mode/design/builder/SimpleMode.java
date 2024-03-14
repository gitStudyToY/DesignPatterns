package com.mode.design.builder;

/**
 * @author Administrator
 */
public class SimpleMode extends AbstractMode {

    @Override
    public void builderMenu() {
        element.setMenu("菜单");
    }

    @Override
    public void builderPlaylist() {
        element.setMenu("播放列表");
    }

    @Override
    public void builderMainWindow() {
        element.setMenu("主窗口");
    }

    @Override
    public void builderControlBar() {
        element.setMenu("控制条");
    }

    @Override
    public void builderFavortiesList() {
        element.setFavortiesList("收藏列表");
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
