package com.sbat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Topping t = new Topping();
        Sandwich s = new Sandwich();
        Drinks d = new Drinks();
        Chips c = new Chips();
        Order o = new Order();
        Scanner userInput = new Scanner(System.in);
//        s.sizePreference();
//        t.calcPrice(s.getSize());

//        System.out.println(s.getSandwichPrice());
//        System.out.println(t.calcPrice("S"));
//        System.out.println(d.addDrink());
//        System.out.println(c.chipsMenu());

        System.out.println(o.getPriceD());


    }
}

