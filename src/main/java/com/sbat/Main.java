package com.sbat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Topping t = new Topping();
        Sandwich s = new Sandwich();
        s.sizePreference();
        t.calcPrice(s.getSize());12321

        System.out.println(t.price);


    }
}

