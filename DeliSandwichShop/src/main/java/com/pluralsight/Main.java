package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        homeScreen();
    }
        public static void homeScreen() {

            boolean choice = true;

            while (choice) {
                String homeScreen = """
                        Welcome to Ice Spice Deli
                        1. New Order
                        0. Exit - exit the application
                        """;
                System.out.println(homeScreen);
                System.out.print("Please choose from the following: ");
                String userchoice = scanner.nextLine();

                switch (userchoice) {
                    case "1", "New Order", "new order":
                        orderScreen();
                        break;
                    case "exit", "Exit", "0":
                        choice = false;
                        break;
                    default:
                        System.out.println("Sorry Spice didn't get that");
                }
            }
        }

    private static void orderScreen() {
        String deliScreen = """
                Welcome to Ice Spice Deli Screen
                1. Add Sandwich
                2. Add Drink
                3. Add Chips
                4. Checkout
                0. Cancel Order
                """;
        System.out.println(deliScreen);
        System.out.print("Choose from the following: ");
        String userChoice = scanner.nextLine();

        boolean choice = true;
        switch (userChoice){
            case "1", "add sandwich", "Add Sandwich": addSandwich();
            break;
            case "2", "add drink", "Add Drink": addDrink();
            break;
            case "3", "add chips", "Add Chips": addChips();
            break;
            case "4", "checkout", "Checkout": checkout();
            break;
            case "0", "exit", "Exit": homeScreen();
            break;
            default:
                System.out.println("Please choose valid answer");


        }


    }

    private static void addSandwich() {
        String sandwichDisplay = """
                __________________________________________
                SANDWICH PRICES | 4"     | 8"     | 12"
                _________________________________________
                Bread           | $5.50  | $7.00  | $8.50
                - White
                - Wheat
                - Rye
                - Wrap
                __________________________________________
                TOPPINGS        | 4"     | 8"     | 12"
                -----------------------------------------
                Meats           | $1.00  | $2.00  | $3.00
                - Steak         |        |        |     
                - Ham           |        |        |     
                - Salami        |        |        |     
                - Roast Beef    |        |        |     
                - Chicken       |        |        |     
                - Bacon         |        |        |     
                __________________________________________
                Extra Meat      | $.50   | $1.00  | $1.50
                __________________________________________
                Cheese          | $.50   | $1.50  | $2.25
                - American      |        |        |     
                - Provolone     |        |        |     
                - Cheddar       |        |        |     
                - Swiss         |        |        |  
                __________________________________________ 
                Extra Cheese    | $.30   | $.60   | $.90
                __________________________________________
                REGULAR TOPPINGS|     Included    |
                - Lettuce
                - Peppers 
                - Onions
                - Tomatoes
                - Jalapenos
                - Cucumbers
                - Pickles
                - Guacamole
                - Mushrooms
                __________________________________________
                Sauces 
                - Mayo
                - Mustard
                __________________________________________
                __________________________________________
                
                
                
                
                
                
                """;
        System.out.println(sandwichDisplay);


    }

    private static void addDrink() {


    }

    private static void addChips() {


    }

    private static void checkout() {


    }
}
