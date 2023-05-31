package com.sbat;
import java.util.*;

class Sandwich {
    private String size;
    private float price;

    public Sandwich() {
    }

    public Sandwich(String size) {
        this.size = size;
    }

    public Sandwich(String size, float price) {
        this.size = size;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void sizePreference() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What size would you like your sandwich to be?" +
                "\nS = Small(4 inch)\nM = Medium(8 inch)\nL = Large (12 inch)");

        size = userInput.next();

        // Set the price based on the selected size
        this.price = calcPrice(size);
    }


    protected float calcPrice(String size) {
        return 0;
    }
}




