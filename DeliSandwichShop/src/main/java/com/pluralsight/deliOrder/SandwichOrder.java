package com.pluralsight.deliOrder;

import java.util.ArrayList;
import java.util.List;

public class SandwichOrder {

    private final List<Sandwich> sandwiches = new ArrayList<>();
    private final List<Drinks> drinks = new ArrayList<>();
    private final List<Chips> chips = new ArrayList<>();

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drinks drink) {
        drinks.add(drink);
    }

    public void addChips(Chips chip) {
        chips.add(chip);
    }

    public double orderTotal() {

        // Calculate the total cost of sandwiches
        double sandwichTotal = sandwiches.stream().mapToDouble(Sandwich::sandwichPrice).sum();

        // Calculate the total cost of drinks
        double drinkTotal = drinks.stream().mapToDouble(Drinks::drinkCost).sum();

        // Calculate the total cost of chips
        double chipTotal = chips.stream().mapToDouble(Chips::chipCost).sum();

        // Return the sum of all the total costs
        double total = sandwichTotal + drinkTotal + chipTotal;

        return total;
    }

    @Override
    public String toString() {
        // Create a StringBuilder instance to build the string representation of the order
        StringBuilder builder = new StringBuilder();

        // Append the header "Sandwiches:" followed by a new line

        sandwiches.forEach(sandwich -> builder.append(sandwich).append("\n"));

        // Append the header "Drinks:" followed by a new line
        drinks.forEach(drink -> builder.append(drink).append("\n"));

        // Append the header "Chips:" followed by a new line
        chips.forEach(chip -> builder.append(chip).append("\n"));

        // Convert the StringBuilder to a String and return it
        return builder.toString();
    }
}



