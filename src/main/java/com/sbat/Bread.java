package com.sbat;

import java.util.*;


class Bread extends Sandwich {
    private String type;

    public Bread(String size, float price, String type) {
        super(size);
        this.type = type;
    }
    public Bread(){}

    @Override
    protected float calcPrice(String size) {
        float price = 0f;
        if (size.equals("S")) {
            price = 5.5f;
        } else if (size.equals("M")) {
            price = 7f;
        } else if (size.equals("L")) {
            price = 8.5f;
        }
        return price;
    }
    public void breadType(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of bread would you like? We have:\nWheat\nRye\nWhite\nWrap");
        type = userInput.next();
    }
}




