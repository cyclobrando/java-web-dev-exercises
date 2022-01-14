package org.launchcode.java.demos.restaurant;

import java.util.Date;

public class MenuItem {
    private String name;
    private Double price;
    private String category;
    private String description;
    private Date lastUpdated;
    private boolean newness;

    public MenuItem(String name, Double price, String category, String description, Date lastUpdated) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.lastUpdated = lastUpdated;
        this.newness = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public boolean isNewness() {
        return newness;
    }

    public void setNewness(boolean newness) {
        this.newness = newness;
    }
}
