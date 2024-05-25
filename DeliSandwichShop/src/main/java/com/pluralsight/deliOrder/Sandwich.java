package com.pluralsight.deliOrder;

public class Sandwich {
    int sandwichSize;
    String toppings;
    String sauces;
    String bread;
    String meat;
    String cheese;
    boolean toastedBread;

    public Sandwich (int sandwichSize, String toppings, String sauces, String bread,
                     String meat, String cheese, boolean toastedBread){
      this.sandwichSize = sandwichSize;
      this.toppings = toppings;
      this.sauces = sauces;
      this.bread = bread;
      this.meat = meat;
      this.cheese = cheese;
      this.toastedBread = toastedBread;
    }
    public double sandwichCost (){
        double cost = 0;
        switch (sandwichSize){
            case 4 :
                cost +=5.50;
                if(!meat.equalsIgnoreCase("none")){
                    cost += 1; // based cost for meat based on sandwich
                    cost += 0.5; // extra cost for meat based on sandwich
                }
                if(!cheese.equalsIgnoreCase("none")){
                    cost += 0.50; // based cost for meat based on sandwich
                    cost += 0.30; // extra cost for meat based on sandwich
                }
            break;
            case 8 :
                cost += 7.00;
                if(!meat.equalsIgnoreCase("none")){
                    cost += 2.; // based cost for meat based on sandwich
                    cost += 1; // extra cost for meat based on sandwich
                }
                if(!cheese.equalsIgnoreCase("none")){
                    cost += 1.50; // based cost for meat based on sandwich
                    cost += 0.60; // extra cost for meat based on sandwich
                }
            break;
            case 12 :
                cost += 8.50;
                if(!meat.equalsIgnoreCase("none")){
                    cost += 3; // based cost for meat based on sandwich
                    cost += 1.50; // extra cost for meat based on sandwich
                }
                if(!cheese.equalsIgnoreCase("none")){
                    cost += 2.25; // based cost for meat based on sandwich
                    cost += 0.90; // extra cost for meat based on sandwich
                }
            default:
                break;
        }
        return cost;
    }
}

