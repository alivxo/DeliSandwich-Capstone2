package com.pluralsight.deliOrder;

public class Sandwich {
    int sandwichSize;
    String toppings;
    String sauces;
    String bread;
    String meat;
    String cheese;
    boolean toastedBread;

    public Sandwich(int sandwichSize, String toppings, String sauces, String bread,
                    String meat, String cheese, boolean toastedBread, String sauceChoice) {
        this.sandwichSize = sandwichSize;
        this.toppings = toppings;
        this.sauces = sauces;
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.toastedBread = toastedBread;
    }

    public double sandwichCost() {
        double cost = 0;
        switch (sandwichSize) {
            case 4:
                cost += 5.50;
                if (!meat.equalsIgnoreCase("none")) {
                    cost += 1; // based cost for meat based on sandwich
                    cost += 0.5; // extra cost for meat based on sandwich
                }
                if (!cheese.equalsIgnoreCase("none")) {
                    cost += 0.50; // based cost for meat based on sandwich
                    cost += 0.30; // extra cost for meat based on sandwich
                }
                break;
            case 8:
                cost += 7.00;
                if (!meat.equalsIgnoreCase("none")) {
                    cost += 2.; // based cost for meat based on sandwich
                    cost += 1; // extra cost for meat based on sandwich
                }
                if (!cheese.equalsIgnoreCase("none")) {
                    cost += 1.50; // based cost for meat based on sandwich
                    cost += 0.60; // extra cost for meat based on sandwich
                }
                break;
            case 12:
                cost += 8.50;
                if (!meat.equalsIgnoreCase("none")) {
                    cost += 3; // based cost for meat based on sandwich
                    cost += 1.50; // extra cost for meat based on sandwich
                }
                if (!cheese.equalsIgnoreCase("none")) {
                    cost += 2.25; // based cost for meat based on sandwich
                    cost += 0.90; // extra cost for meat based on sandwich
                }
            default:
                break;
        }
        return cost;
    }

    @Override
    public String toString() {
        String noToppings = "no toppings";
        String noSauce = "no sauces";
        String noMeat = "no meat";
        String noCheese = "no cheese";

        // Set noCheese to the actual cheese value if cheese is not "none", otherwise set it to "no cheese"
        noCheese = !cheese.equalsIgnoreCase("none") ? cheese : "no cheese";

        // Set noMeat to the actual meat value if meat is not "none", otherwise set it to "no meat"
        noMeat = !meat.equalsIgnoreCase("none") ? meat : "no meat";

        // Set noSauce to the actual sauce value if  sauce is not "none", otherwise set it to "no sauce"
        noSauce = !sauces.equalsIgnoreCase("none") ? sauces : "no sauce";

        // Set noToppings to the actual toppings value if toppings is not "none", otherwise set it to "no toppings"
        noToppings = !toppings.equalsIgnoreCase("none") ? toppings : "no cheese";


        return sandwichSize + "-" + bread + "sandwich including "+ noToppings + ", "+ noSauce + ", "+ noMeat + ", "+ noCheese + (toastedBread ? "toasted" : "not toasted");
    }

}



