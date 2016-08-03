package com.lombardo.model;

import java.util.HashMap;
import java.util.Map;

public class Drink {
    // price, ingredients, menu position, can be made
    private int price;
    private Map<Ingredient, Integer> recipe;
    private int menuPosition;

    public Drink(Map<Ingredient, Integer> recipe, int menuPosition) {
        this.recipe = new HashMap<>(recipe);
        this.menuPosition = menuPosition;
        this.price = setPrice();
    }

    public int getPrice() {
        return price;
    }

    private int setPrice() {
        int total = 0;
        for (Map.Entry<Ingredient, Integer> item : recipe.entrySet() ) {
            int value = item.getKey().getPrice() * item.getValue();
            total += value;
        }
        return total;
    }
}
