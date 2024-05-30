package com.pluralsight.deliOrder;

public class Chips {
    String chipType;

    public Chips (String chipType){

        this.chipType = chipType;
    }

    public double chipCost (){
        return 1.50;
    }
    @Override
    public String toString (){
        return "Chips: " + chipType + "-" + chipCost();
    }
}

