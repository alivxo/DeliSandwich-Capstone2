package com.pluralsight;

import com.pluralsight.deliOrder.Chips;
import com.pluralsight.deliOrder.Drink;
import com.pluralsight.deliOrder.Sandwich;
import com.pluralsight.deliOrder.SandwichOrder;

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
        SandwichOrder order = new SandwichOrder();
        String deliScreen = """
                Welcome to Ice Spice Deli
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
            case "1", "add sandwich", "Add Sandwich": addSandwich(order);
            break;
            case "2", "add drink", "Add Drink": addDrink(order);
            break;
            case "3", "add chips", "Add Chips": addChips(order);
            break;
            case "4", "checkout", "Checkout": checkout();
            break;
            case "0", "exit", "Exit": homeScreen();
            break;
            default:
                System.out.println("Please choose valid answer");


        }


    }

    private static void addSandwich(SandwichOrder order) {
        String sandwichDisplay = """
                
                ____________________________________________
                |SANDWICH PRICES | 4"     | 8"     | 12"   |
                |__________________________________________|
                |Bread           | $5.50  | $7.00  | $8.50 |
                |- White         |        |        |       |
                |- Wheat         |        |        |       |
                |- Rye           |        |        |       |
                |- Wrap          |        |        |       |
                |__________________________________________|
                |TOPPINGS        | 4"     | 8"     | 12"   |
                |------------------------------------------|
                |Meats           | $1.00  | $2.00  | $3.00 |
                |- Steak         |        |        |       |
                |- Ham           |        |        |       |     
                |- Salami        |        |        |       |     
                |- Roast Beef    |        |        |       |     
                |- Chicken       |        |        |       |           
                |- Bacon         |        |        |       |     
                |__________________________________________
                |Extra Meat      | $.50   | $1.00  | $1.50 |
                |__________________________________________|
                |Cheese          | $.50   | $1.50  | $2.25 |
                |- American      |        |        |       |     
                |- Provolone     |        |        |       |  
                |- Cheddar       |        |        |       |     
                |- Swiss         |        |        |       |
                |__________________________________________| 
                |Extra Cheese    | $.30   | $.60   | $.90  |
                |__________________________________________|
                |REGULAR TOPPINGS|     Included    |       |
                |- Lettuce                                 |
                |- Peppers                                 |
                |- Onions                                  |
                |- Tomatoes                                |
                |- Jalapenos                               |
                |- Cucumbers                               |
                |- Pickles                                 |
                |- Guacamole                               |
                |- Mushrooms                               |
                |__________________________________________|
                |SAUCES          |     Included    |       |
                |- Mayo                                    |
                |- Mustard                                 | 
                |- Ketchup                                 |
                |- Ranch                                   |
                |-Thousands Islands                        |
                |-Vinaigrette                              |
                |__________________________________________|
                |SIDES           |     Included    |       |
                |-AU Jus
                |-Sauce
                ___________________________________________|
                |OTHER PRODUCTS|Small  | Medium    |Large  |
                |Drinks        |2.00   |2.50       |3.00   |
                -------------------------------------------|
                |Chips                1.50                 |
                |__________________________________________|
                """;
        System.out.println(sandwichDisplay);

        System.out.print("What bread size would you like?:  ");
        int breadSize = scanner.nextInt();
        scanner.nextInt();

        System.out.print("What type of bread would you like?: ");
        String breadChoice = scanner.nextLine();

        System.out.print("What type of meat would you like?:  ");
        String meatChoice = scanner.nextLine();

        System.out.print("Would you like extra meat?");
        String extraMeat = scanner.nextLine();

        System.out.print("What type of cheese would you like?: ");
        String cheeseChoice = scanner.nextLine();

        System.out.print("Would you like extra cheese?: ");
        String extraCheese = scanner.nextLine();

        System.out.print("Would you like any sauce?: ");
        String sauceChoice = scanner.nextLine();

        System.out.println("Would you like your sandwich toasted? (yes/no): ");
        boolean toastedBread = scanner.nextLine().equalsIgnoreCase("yes");

        Sandwich sandwich = new Sandwich(breadSize,breadChoice,meatChoice,
                            cheeseChoice,extraMeat,extraCheese,toastedBread);
        order.addSandwich(sandwich);
        System.out.println("Sandwich added.");


    }

    private static void addDrink(SandwichOrder order) {
        System.out.println("What size drink would you like: ");
        String drinkSizeChoice = scanner.nextLine();

        System.out.println("What flavor drink would you like?: ");
        String drinkFlavorChoice = scanner.nextLine();

        Drink drink = new Drink(drinkFlavorChoice,drinkSizeChoice);
        order.addDrink(drink);
        System.out.println("Drink Added.");

    }

    private static void addChips(SandwichOrder order) {
        System.out.println("What type of chips would you like? ");
        String chipsChoice = scanner.next();

        Chips chips = new Chips(chipsChoice);
        order.addChips(chips);
        System.out.println("Chips Added.");


    }

    private static void checkout() {


    }
}
