package com.pluralsight.deliOrder;

public class Sandwich {
    private int sandwichSize;
    private String bread;
    private String meat;
    private String extraMeat;
    private String cheese;
    private String extraCheese;
    private String sauce;
    private String breadToasted;
    private String toppings;

    public Sandwich(int sandwichSize, String bread, String meat, String extraMeat,
                    String cheese, String extraCheese, String sauce, String breadToasted, String toppings) {


        this.sandwichSize = sandwichSize;
        this.bread = bread;
        this.meat = meat;
        this.extraMeat = extraMeat;
        this.cheese = cheese;
        this.extraCheese = extraCheese;
        this.sauce = sauce;
        this.breadToasted = breadToasted;
        this.toppings = toppings;
    }


    public double sandwichPrice() {
        double cost = 0;

        // cost based on sandwichSize
        if (sandwichSize == 4) {
            cost += 5.50;
        } else if (sandwichSize == 8) {
            cost += 7.00;
        } else if (sandwichSize == 12) {
            cost += 8.50;
        }

        // cost based on extra meat
        if (extraMeat != null && extraMeat.equalsIgnoreCase("yes")) {
            if (sandwichSize == 4) {
                cost += .50;
            } else if (sandwichSize == 8) {
                cost += 1.00;
            } else if (sandwichSize == 12) {
                cost += 1.50;
            }
        }

        // cost based on cheese
        if (cheese != null && cheese.equalsIgnoreCase("yes")) {
            if (sandwichSize == 4) {
                cost += .75;
            } else if (sandwichSize == 8) {
                cost += 1.50;
            } else if (sandwichSize == 12) {
                cost += 2.25;
            }
        }

        // cost based on extra cheese
        if (extraCheese != null && extraCheese.equalsIgnoreCase("yes")) {
            if (sandwichSize == 4) {
                cost += .75;
            } else if (sandwichSize == 8) {
                cost += 1.50;
            } else if (sandwichSize == 12) {
                cost += 2.25;
            }
        }

        return cost;
    }

    @Override
    public String toString() {
        return  "Sandwich: " + sandwichSize + " inch sandwich with " + bread + " bread, " + meat + " meat" +
                (extraMeat != null ? ", extra meat: " + extraMeat : "") +
                (cheese != null ? ", cheese: " + cheese : "") +
                (extraCheese != null ? ", extra cheese: " + extraCheese : "") +
                ", toppings: " + toppings + ", sauce: " + sauce +
                ", toasted: " + breadToasted + " - Price: $" + sandwichPrice();
    }
}


