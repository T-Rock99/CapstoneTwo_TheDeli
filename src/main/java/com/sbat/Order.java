package com.sbat;

import java.util.ArrayList;

public class Order{ // highest parent class
    ArrayList<Sandwich> sandwich = new ArrayList();
//    ArrayList<Drink> drink = new ArrayList();
    ArrayList<Chips> chips = new ArrayList();
    private float price;
    private int orderNumber;

    public Order(float price, int orderNumber) {
        this.price = price;
        this.orderNumber = orderNumber;
    }

    public float getPrice() {
        return price;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    public static void addSandwich(){

    }

}

