package com.lombardo.model;

public class Ingredient {
    private int price;
    private String description;

    public Ingredient(int price, String description) {
        this.price = price;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
}
