package com.pluralsight.deliOrder;

public class Drinks {

    String drinkFlavorChoice;
    String drinkSizeChoice;

    public Drinks(String drinkFlavorChoice, String drinkSizeChoice) {
        this.drinkFlavorChoice = drinkFlavorChoice;
        this.drinkSizeChoice = drinkSizeChoice;
    }

    public double drinkCost() {
        double cost = 0;
        switch (drinkSizeChoice){
            case "small","Small","s":
                return 2.00;
            case "medium", "Medium","m":
                return 2.50;
            case "large", "Large","l":
                return 3.00;
        } return cost;
    }

    @Override
    public String toString() {
        return "Drink:" + drinkFlavorChoice + " - " + drinkSizeChoice + " - $ " + drinkCost();

    }

}

