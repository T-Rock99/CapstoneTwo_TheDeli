package com.at;

import java.util.*;

public class Sandwich{
    private char size;
    private float price;
    public static void sandwichBuild(){

    }

    public Sandwich() {
    }

    public Sandwich(char size, float price) {
        this.size = size;
        this.price = price;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}




