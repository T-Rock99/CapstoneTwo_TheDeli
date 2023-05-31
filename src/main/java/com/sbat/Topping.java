package com.sbat;

import java.util.ArrayList;
import java.util.Scanner;

public class Topping extends Sandwich {
    private ArrayList<String> Meat = new ArrayList();
    private ArrayList<String> Sides = new ArrayList();
    private ArrayList<String> Sauces = new ArrayList();
    private ArrayList<String> Regular = new ArrayList();
    private ArrayList<String> Cheese = new ArrayList();
    protected float price;
    private boolean extraMeat;
    private boolean extraCheese;

    public String toppings() {
        Meat.add("Steak");
        Meat.add("Ham");
        Meat.add("Salami");
        Meat.add("Roast Beef");
        Meat.add("Chicken");
        Meat.add("Bacon");

        Sides.add("Au jus");
        Sides.add("Sauce");

        Sauces.add("Mayo");
        Sauces.add("Mustard");
        Sauces.add("Ketchup");
        Sauces.add("Ranch");
        Sauces.add("Thousand Islands");
        Sauces.add("Vinaigrette");

        Regular.add("Lettuce");
        Regular.add("Peppers");
        Regular.add("Onions");
        Regular.add("Tomatoes");
        Regular.add("Jalapenos");
        Regular.add("Cucumbers");
        Regular.add("Pickles");
        Regular.add("Guacamole");
        Regular.add("Mushrooms");

        Cheese.add("American");
        Cheese.add("Provolone");
        Cheese.add("Cheddar");
        Cheese.add("Swiss");
        return null;
    }

    @Override
    protected float calcPrice(String size) {
        float price = 0f;
        Scanner userInput = new Scanner(System.in);

        System.out.println("How many servings of meat would you like?");
        int meatServings = userInput.nextInt();
        System.out.println("How many servings of cheese would you like?");
        int cheeseServings = userInput.nextInt();


        if (size.equals("S")) {
            for (int i = 0; i < meatServings; i++) {
                price += 1f;
            }
            for (int i = 0; i < cheeseServings; i++) {
                price += 0.75f;
            }
            if (extraMeat) {
                price += 0.5f;
            }
            if (extraCheese) {
                price += 0.3f;
            }

        } else if (size.equals("M")) {
            for (int i = 0; i < meatServings; i++) {
                price += 2f;
            }
            for (int i = 0; i < cheeseServings; i++) {
                price += 1.5f;
            }
            if (extraMeat) {
                price += 1f;
            }
            if (extraCheese) {
                price += 0.6f;
            }
        } else if (size.equals("L")) {
            for (int i = 0; i < meatServings; i++) {
                price += 3f;
            }
            for (int i = 0; i < cheeseServings; i++) {
                price += 2.25f;
            }
                if (extraMeat = true) {
                    price += 1.5f;
                }
                if (extraCheese = true) {
                    price += 0.9f;
            }
        }
        return price;
    }
}
