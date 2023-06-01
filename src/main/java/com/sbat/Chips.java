package com.sbat;

import java.util.ArrayList;
import java.util.Scanner;

public class Chips {
    static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Chips> chipsList = new ArrayList<>();
    public Chips(){}

    public float addChips(){
        loadChips();

        String input;

        do {
            System.out.println("Would you like chips?");
            input = scanner.next();

            if(input.equalsIgnoreCase("Yes")){
                price += 1.5f;
            }

            System.out.println("Spicy chips or regular chips?");
            input = scanner.next();

            System.out.println("Would you like another order of chips?\nType 'No' to exit, otherwise any input to order more chips.");
            input = scanner.next();

            switch (input) {
//                case "1":
//                    displayChips();
//                    break;

                case "No":
                    System.out.println("We Gotchu!! The chips have been added to your cart");
                    break;

                default:
                    System.out.println("");
            }
        } while (!input.equalsIgnoreCase("No"));
        return price;
    }

    private static void loadChips() {
        Chips regularChip = new Chips("Regular Chip", 1.50f, false);
        Chips spicyChip = new Chips("Spicy Chip", 1.50f, true);

        chipsList.add(regularChip);
        chipsList.add(spicyChip);
    }

    private String name;
    private float price;
    private boolean isSpicy;

    public Chips(String name, float price, boolean isSpicy) {
        this.name = name;
        this.price = price;
        this.isSpicy = isSpicy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    @Override
    public String toString() {
        return "Chips{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isSpicy=" + isSpicy +
                '}';
    }

//    public static void displayChips() {
//        for (Chips chip : chipsList) {
//            System.out.println("Name: " + chip.getName());
//            System.out.println("Price: " + chip.getPrice());
//            System.out.println("Spicy: " + (chip.isSpicy() ? "Yes" : "No"));
//            System.out.println();
//        }
//    }
}