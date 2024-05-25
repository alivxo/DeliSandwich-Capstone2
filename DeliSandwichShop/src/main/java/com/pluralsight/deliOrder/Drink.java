package com.pluralsight.deliOrder;

public class Drink {
    String drinkFlavor;
    String sizeDrink;

    public Drink(String drinkFlavor, String sizeDrink) {
        this.drinkFlavor = drinkFlavor;
        this.sizeDrink = sizeDrink;
    }

    public double drinkCost (){
        double cost = 0;
        switch (sizeDrink){
            case "small","Small":
                return 2.00;
            case "medium", "Medium":
                return 2.50;
            case "large", "Large":
                return 3.00;
        }
        return 0;
    }
    @Override
    public String toString(){
        return sizeDrink + " "+ drinkFlavor;
    }

}
