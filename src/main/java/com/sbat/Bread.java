package com.sbat;

import java.util.*;


public class Bread extends Sandwich {
    private String type;

    public Bread(String size, float price, String type) {
        super(size);
        this.type = type;
    }
    public Bread(){}

    public void breadType(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of bread would you like? We have:\nWheat\nRye\nWhite\nWrap");
        type = userInput.next();
    }
}




