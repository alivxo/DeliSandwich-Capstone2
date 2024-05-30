package com.pluralsight;

import com.pluralsight.deliOrder.Chips;
import com.pluralsight.deliOrder.Drinks;
import com.pluralsight.deliOrder.Sandwich;
import com.pluralsight.deliOrder.SandwichOrder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    static final LocalDateTime today = LocalDateTime.now();
    static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    static final String formattedDate = today.format(dateFormat);
    static final DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
    static final String formattedTime = today.format(timeFormat);
    private static Sandwich sandwiches;

    public static void main(String[] args) {
        homeScreen();
    }

    private static void homeScreen() {
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
        boolean choice = true;
        while (choice) {
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

            switch (userChoice) {
                case "1", "add sandwich", "Add Sandwich":
                    addSandwich(order);
                    break;
                case "2", "add drink", "Add Drink":
                    addDrink(order);
                    break;
                case "3", "add chips", "Add Chips":
                    addChips(order);
                    break;
                case "4", "checkout", "Checkout":
                    checkout(order);
                    choice = false;
                    break;
                case "0", "exit", "Exit":
                    homeScreen();
                    break;
                default:
                    System.out.println("Please choose valid answer");


            }
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
                |-AU Jus                                   |
                |-Sauce                                    |
                ___________________________________________|
                |OTHER PRODUCTS|Small  | Medium    |Large  |
                |Drinks        |2.00   |2.50       |3.00   |
                -------------------------------------------|
                |Chips                1.50                 |
                |__________________________________________|
                """;
        System.out.println(sandwichDisplay);

        boolean choice = true;

        while (choice) {

            System.out.println("What size bread would you like?: ");
            int sandwichSize = scanner.nextInt();
            scanner.nextLine();

            System.out.println("What type of bread would you like?: ");
            String bread = scanner.nextLine();

            System.out.println("Would you like to add meat?: ");
            String meatChoice = scanner.nextLine();
            String meat = null;
            if(meatChoice.equalsIgnoreCase("yes")){
                System.out.println("What type of meat would you like?: ");
                meat = scanner.nextLine();
            }

            System.out.println("Would you like extra meat?: ");
            String extraMeatoption = scanner.nextLine();
            String extraMeat = null;
            if (extraMeatoption.equalsIgnoreCase("yes")) {
                System.out.println("What type of meat would you like to add?: ");
                extraMeat = scanner.nextLine();
            }


            System.out.println("Would you like to add cheese?: ");
            String cheeseChoice = scanner.nextLine();
            String cheese = null;
            if(cheeseChoice.equalsIgnoreCase("yes")) {
                System.out.println("What type of cheese would you like?: ");
                cheese = scanner.nextLine();
            }

            System.out.println("Would you like extra cheese?: ");
            String extraCheeseoption = scanner.nextLine();
            String extraCheese = null;
            if (extraCheeseoption.equalsIgnoreCase("yes")) {
                System.out.println("What type of cheese would you like to add?: ");
                extraCheese = scanner.nextLine();
            }

            System.out.println("What type of sauce would you like?:  ");
            String sauce = scanner.nextLine();

            System.out.println("Would you like any other toppings?:  ");
            String toppings = scanner.nextLine();

            System.out.println("Would you like your bread toasted?: ");
            String breadToasted = scanner.nextLine();

            Sandwich sandwich = new Sandwich(sandwichSize,bread,meat,extraMeat,
                    cheese,extraCheese, sauce, breadToasted, toppings);

            order.addSandwich(sandwich);
            System.out.println("Sandwich added to basket");

            System.out.println("Would you like to create another sandwich?(yes/no): ");
            String userSandwichChoice = scanner.nextLine();

            if (userSandwichChoice.equalsIgnoreCase("no")) {
                choice = false;
                askforDrink(order);
            }

        }

    }

    private static void askforDrink(SandwichOrder order) {
        System.out.println("Would you like to add a drink? (yes/no): ");
        String userDrinkChoice = scanner.nextLine();
        System.out.println(userDrinkChoice);
        if (userDrinkChoice.equalsIgnoreCase("yes")) {
            addDrink(order);
        }
        checkout(order);
    }


    private static void addDrink(SandwichOrder order) {
        boolean choice = true;
        while (choice) {

            String drinkMenu = """
                ____________________________________________
                |Drinks          | Small  | Medium | Large |
                |__________________________________________|
                |- Arizona       | $2.00  | $2.50  | $3.00 |
                |- Sparkling     |        |        |       |     
                |- Coca Cola     |        |        |       |  
                |- Water         |        |        |       |     
                |- Ginger Ale    |        |        |       |
                |__________________________________________| 
                    """;

            System.out.println(drinkMenu);

            System.out.println("What size drink would you like: ");
            String drinkSizeChoice = scanner.nextLine();

            System.out.println("What flavor drink would you like?: ");
            String drinkFlavorChoice = scanner.nextLine();

            Drinks drink = new Drinks(drinkFlavorChoice, drinkSizeChoice);
            order.addDrink(drink);
            System.out.println("Drink Added.");


            System.out.println("Would you like to add another drink?(yes/no): ");
            String userDrinkChoice = scanner.nextLine();

            if (userDrinkChoice.equalsIgnoreCase("no")) {
                choice = false;
                askforChips(order);
            }
        }
    }

    private static void askforChips(SandwichOrder order) {
        System.out.println("What would you like a bag of chips(yes/no)?: ");
        String chipChoice = scanner.nextLine();
        if (chipChoice.equalsIgnoreCase("yes")) {
            addChips(order);
        }
        checkout(order);
    }

    private static void addChips(SandwichOrder order) {
        String chipsMenu = """
                ____________________________________________
                |Chips          ALL CHIPS $1.50            |
                |__________________________________________|
                |- Hot Cheetos   |        |        |       |
                |- Doritos       |        |        |       |     
                |- Baked Lays    |        |        |       |  
                |- Pringles      |        |        |       |     
                |- Onion Rings   |        |        |       |
                |__________________________________________| 
                    """;
        System.out.println(chipsMenu);

        boolean choice = true;
        while (choice) {
            System.out.println("What type of chip would you like: ");
            String chips = scanner.nextLine();

            Chips chip = new Chips(chips);
            order.addChips(chip);
            System.out.println("Chip Added.");

            System.out.println("Would you like to add another bag of chips?(yes/no): ");
            String userChipChoice2 = scanner.nextLine();

            if (userChipChoice2.equalsIgnoreCase("no")) {
                choice = false;
                checkout(order);
            }
        }
    }

    private static void checkout(SandwichOrder order) {
        System.out.println("Cart: ");
        System.out.println(order);
        String receipt = order.toString() + "Total Cost: $ " + order.orderTotal();
        System.out.println(receipt);

        String orderCost = """
                Would you like to Checkout?
                1. Confirm
                0. Cancel Order
                """;
        System.out.println(orderCost);
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 1: orderReciept(order);
                break;
            case 0:
                System.out.println("Order is cancelled.");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }

    private static void orderReciept(SandwichOrder order) {

        String receipt = order.toString() + "Total Cost: $ " + order.orderTotal();
        File file = new File ("order.txt");
        try {

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write ("Today's Date: " + formattedDate + "\n" + "Today's Time: " + formattedTime + "\n" + receipt);
            bufferedWriter.close();

            System.out.println(" Have a great day!");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
