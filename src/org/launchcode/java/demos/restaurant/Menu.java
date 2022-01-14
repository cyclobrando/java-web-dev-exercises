package org.launchcode.java.demos.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList menu = new ArrayList<>();
    private Date lastUpdated;

    public Menu(ArrayList menu, Date lastUpdated) {
        this.menu = menu;
        this.lastUpdated = lastUpdated;
    }

    public ArrayList getMenu() {
        return menu;
    }

    public void setMenu(ArrayList menu) {
        this.menu = menu;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
