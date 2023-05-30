package com.at;

public class Order{ // highest parent class
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

