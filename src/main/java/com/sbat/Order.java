package com.sbat;

import java.util.ArrayList;

public class Order{
    private float price;

    public Order(){}

    public Order(float price) {
        this.price = price;
    }

    public float getPriceD() {
        Sandwich s = new Sandwich();
        Drinks d = new Drinks();
        Chips c = new Chips();

        price = s.addSandwich() + d.addDrink() + c.chipsMenu();
        return price;
    }

    public String showReceipt(){
    }
}

