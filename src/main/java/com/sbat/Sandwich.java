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

//    public float getPrice() {
//        return price;
//    }

public float getPrice() {
        sizePreference();
        Topping t = new Topping();
        t.calcPrice(size);

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

    public float sizePreference() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What size would you like your sandwich to be?" +
                "\nS = Small(4 inch)\nM = Medium(8 inch)\nL = Large (12 inch)");

        size = userInput.next();
        if (size.equals("S")) {
            price += 5.5f;
        } else if (size.equals("M")) {
            price += 7f;
        } else if (size.equals("L")) {
            price += 8.5f;
        }
        return price;
    }


//    protected float calcPrice(String size) {
//        return price;
//    }
//    protected float calcPrice(String size) {
//        if (size.equals("S")) {
//            price += 5.5f;
//        } else if (size.equals("M")) {
//            price += 7f;
//        } else if (size.equals("L")) {
//            price += 8.5f;
//        }
//        return price;
//    }
}




