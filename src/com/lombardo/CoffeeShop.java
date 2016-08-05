package com.lombardo;

import com.lombardo.model.Drink;
import com.lombardo.model.Ingredient;

import java.util.List;
import java.util.Map;

public class CoffeeShop {

    private List<Drink> menu;
    private Map<Ingredient, Integer> inventory;
    private int cashOnHand;

    public CoffeeShop(List<Drink> menu, Map<Ingredient, Integer> inventory, int cashOnHand) {
        this.menu = menu;
        this.inventory = inventory;
        this.cashOnHand = cashOnHand;
    }

    public Drink makeDrink(String drinkName) {
        // lower the inventory and return the drink 

        return null;
    }

    public void acceptPayment(int payment) {
        cashOnHand += payment;
    }

}
