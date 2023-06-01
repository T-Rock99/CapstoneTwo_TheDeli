package com.sbat;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Sandwich> sandwiches = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadHomeScreen();
    }

    private static void loadHomeScreen() {
        String input;
        do {
            System.out.println("Please enter command");
            System.out.println("\t1: New order");
            System.out.println("\t0: Exit");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    orderScreen();
                    break;
                case "0":
                    System.out.println("Exit");
            }
        } while (!input.equalsIgnoreCase("0"));
    }

    public static void orderScreen() {
        Sandwich s = new Sandwich();
        Drinks d = new Drinks();
        Chips c = new Chips();
        Order o = new Order();

        String input;

        do {
            System.out.println("Please enter command");
            System.out.println("\t1: Add sandwich");
            System.out.println("\t2: Add drink");
            System.out.println("\t3: Add chips");
            System.out.println("\t4: Checkout");
            System.out.println("\t0: Cancel order");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    s.addSandwich();
                    break;
                case "2":
                    d.addDrink();
                    break;
                case "3":
                    c.addChips();
                    break;
                case "4":
                    checkout();
                case "0":
                    System.out.println("Cancel Order");
            }
        } while (!input.equalsIgnoreCase("0"));
    }

    public static void checkout() {
        String subInput;
        do {
            subInput = scanner.nextLine();
            System.out.println("Please enter a command");
            System.out.println("\t1: Confirm");
            System.out.println("\t2: Cancel order");

        } while (!subInput.equalsIgnoreCase("3"));
    }
}


