package model;

/**
 * Created by mohini on 19/12/17.
 */

public class NavDrawerItem {

    private boolean showNotify;
    private String title;

    public NavDrawerItem(){

    }

    public NavDrawerItem(boolean showNotify, String title){

        this.showNotify = showNotify;
        this.title = title;
    }

    // getters and setters
    public boolean isShowNotify(){
        return showNotify;
    }

    public void setShowNotify(boolean showNotify){
        this.showNotify =showNotify;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
