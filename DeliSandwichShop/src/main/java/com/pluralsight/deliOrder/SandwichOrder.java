package com.pluralsight.deliOrder;

import java.util.ArrayList;
import java.util.List;

public class SandwichOrder {
    List<Sandwich> sandwiches = new ArrayList<>();
    List <Drink> drinks = new ArrayList<>();
    List <Chips> chips = new ArrayList<>();

    public void addSandwich (Sandwich sandwich){
        sandwiches.add(sandwich);
    }
    public void addDrink (Drink drink) {
        drinks.add(drink);
    }
    public void addChips (Chips chip) {
        chips.add(chip);
    }


}
