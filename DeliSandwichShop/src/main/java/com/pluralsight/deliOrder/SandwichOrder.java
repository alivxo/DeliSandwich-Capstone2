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

    public double sandwichTotal() {
        // converting the list of sandwiches into a stream and mapping each sanwdwich
        // to its cost using the sandwichCost() method and sum up the cost of the sandwich

        double sandwichTotalCost = sandwiches.stream().mapToDouble(Sandwich::sandwichCost).sum();

        // converting the list of drinks into a stream and mapping each drink
        // to its cost using the drinkCost() method and sum up the cost of each drink

        double drinkTotalCost = drinks.stream().mapToDouble(Drink::drinkCost).sum();

        // converting the list of chips into a stream and mapping each chips
        // to its cost using the chipsCost() method and sum up the cost of each bag of chips

        double chipTotalCost = chips.stream().mapToDouble(Chips::chipCost).sum();

        // returning the sum of all the total cost
        return sandwichTotalCost + drinkTotalCost + chipTotalCost;
    }

    @Override
    public String toString (){
        // creating String builder instance to build the string representation of the order

        StringBuilder stringBuilder = new StringBuilder();

        // Append the header "Sandwiches: " followed by a new line.
        stringBuilder.append("Sandwiches: \n");

        // Going over each sandwich on the list and
        // append its string representation followed by a newline to the StringBuilder
        sandwiches.forEach(sandwich -> stringBuilder.append(sandwich).append("\n"));

        // Append the header "Drinks: " followed by a new line.
        stringBuilder.append("Drinks: \n");

        // Going over each drink on the list and
        // append its string representation followed by a newline to the StringBuilder
        drinks.forEach(drink -> stringBuilder.append(drink).append("\n"));

        // Append the header "Chips: " followed by a new line.
        stringBuilder.append("Chips: \n");

        // Going over each bag of chips on the list and
        // append its string representation followed by a newline to the StringBuilder
        chips.forEach(chips1 -> stringBuilder.append(chips).append("\n"));

        // Convert the StringBuilder to a String and return it
        return stringBuilder.toString();
    }

}
