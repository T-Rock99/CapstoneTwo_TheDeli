package com.sbat;

import java.util.ArrayList;
import java.util.Scanner;


class Drinks {
    static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Drinks> drinksList = new ArrayList<>();



    private static void loadDrinks() {

        Drinks Salha = new Drinks("Small", true, "Salha", "Strawberry Lemonade Juice", 2f);
        Drinks Torue = new Drinks("Medium", true, "Torue", "Tangerine Passion Flavored Water", 2.50f);
        Drinks Braynel = new Drinks("Small", false, "Braynel", "Berry Blast Soda", 2f);
        Drinks Andy = new Drinks("Large", true, "Andy", "Amazing Apple Juice", 3f);

        drinksList.add(Salha);
        drinksList.add(Torue);
        drinksList.add(Braynel);
        drinksList.add(Andy);

    }


    private String size;
    private boolean ice;
    private String brand;
    private String flavor;
    private float price;
    private float ordersOfDrinks;

    public float getOrdersOfDrinks() {
        return ordersOfDrinks;
    }

    public Drinks(String size, boolean ice, String brand, String flavor, float price) {
        this.size = size;
        this.ice = ice;
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
    }

    public Drinks() {

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isIce() {
        return ice;
    }

    public void setIce(boolean ice) {
        this.ice = ice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public float addDrink(){

        String userInput;
        String size;
//        int ordersOfDrinks = 0;
        do {
            System.out.println("Please enter a command: " + "\nS = Small(S), \nM = Medium(M), \nL = Large (L)");

            System.out.println("\t1: Please select drink size: ");
            userInput = scanner.nextLine();
            size = userInput;

            if (size.equals("S")) {
                price += 2f;
            } else if (size.equals("M")) {
                price += 2.5f;
            } else if (size.equals("L")) {
                price += 3f;
            }

            System.out.println("\t2: Please select drink: ");
            userInput = scanner.nextLine();

            System.out.println("\t3: Would you like ice?: ");
            userInput = scanner.nextLine();

            System.out.println("\t4: Please select flavor choice:");
            userInput = scanner.nextLine();

            System.out.println("\t5: Would you like another drink?");
            userInput = scanner.nextLine();
            ordersOfDrinks ++;



            switch (userInput) {
                case "1":
                    loadDrinks();
                    break;

                case "2":
                    displayDrinks();
                    break;

                default:
                    System.out.println("Your drink has been added");

            }

        } while (!userInput.equalsIgnoreCase("No"));
        return price;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "size=" + size +
                ", ice=" + ice +
                ", brand='" + brand + '\'' +
                ", flavor='" + flavor + '\'' +
                '}';
    }

    public static void displayDrinks(){
        for (Drinks drink : drinksList) {
            System.out.println("Drink Size: " + drink.getSize());
            System.out.println("Ice: " + (drink.isIce() ? "Yes" : "No"));
            System.out.println("Brand: " + drink.getBrand());
            System.out.println("Flavor: " + drink.getFlavor());
            System.out.println("Price: " + drink.getPrice());
            System.out.println();
            break;


        }
    }


}