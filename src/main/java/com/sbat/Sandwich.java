package com.sbat;
import java.util.*;

class Sandwich {
    private String size;
    private float price;

    public float getPrice() {
        return price;
    }

    public Sandwich() {
    }

    public Sandwich(String size) {
        this.size = size;
    }

    public Sandwich(String size, float price) {
        this.size = size;
        this.price = price;
    }

    public float getBreadPrice() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What size would you like your sandwich to be?" +
                "\nS = Small(4 inch)\nM = Medium(8 inch)\nL = Large (12 inch)");
        String sizeInput = userInput.next();
        size = sizeInput;
        return price;
    }

    public float getSandwichPrice() {
        getBreadPrice();
        float toppingPrice = calculateToppingPrice(size);
        if (size.equals("S")) {
            price += 5.5f;
        } else if (size.equals("M")) {
            price += 7f;
        } else if (size.equals("L")) {
            price += 8.5f;
        }
        price += toppingPrice;

        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    protected float calculateToppingPrice(String size) {
        Topping t = new Topping();
        return t.calcPrice(size);
    }
}




