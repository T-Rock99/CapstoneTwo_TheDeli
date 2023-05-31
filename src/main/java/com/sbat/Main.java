package com.sbat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread();
        bread.sizePreference();
        System.out.println("Size: " + bread.getSize());
        System.out.println("Price: " + bread.getPrice());

    }
}

