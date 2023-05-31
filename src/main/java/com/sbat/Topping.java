package com.sbat;

import java.util.ArrayList;
import java.util.Scanner;

public class Topping extends Sandwich {
    private ArrayList<String> Meat = new ArrayList();
    private ArrayList<String> Sides = new ArrayList();
    private ArrayList<String> Sauces = new ArrayList();
    private ArrayList<String> Regular = new ArrayList();
    private ArrayList<String> Cheese = new ArrayList();
    private static float price;
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


        if (size.equals("S")) {
            System.out.println("How many servings of meat would you like?");
            int meatServings = userInput.nextInt();
            System.out.println("How many servings of cheese would you like?");
            int cheeseServings = userInput.nextInt();
            for(int i=0;i<meatServings;i++){
                price += 1f;
            }
            if (extraMeat){
                price += 0.5f;
            }
            if (extraCheese){
                price += 0.75f;
            }

//            System.out.println("Would you like extra meat?");
        }

        else if (size.equals("M")) {
            int servings = meatInput.nextInt();
            price = 7f;
            if (extraMeat = true){
                price += 1f;
            }
            if (extraCheese = true){
                price += 1.5f;
            }
            for(int i=0;i<servings;i++){
                price += 2f;
            }
        }

        else if (size.equals("L")) {
            price = 8.5f;
            if (extraMeat = true){
                price += 1.5f;
            }
            if (extraCheese = true){
                price += 2.25f;
            }
            for(int i=0;i<meatInput.nextInt();i++){
                price += 3f;
            }

        }
        return price;
    }
}
