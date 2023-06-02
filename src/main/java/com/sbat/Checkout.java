package com.sbat;

import java.io.*;
import java.io.FileWriter;

public class Checkout {
    Sandwich s = new Sandwich();
    Drinks d = new Drinks();
    Chips c = new Chips();

    private static String sandwichSize;
    private static String chipsFlavor;
    private static String drinksBrand;
    private static float transcationOrder;
    private float price;

    public void CheckoutMethod(){
        displayReceipt();

    }
    public String getTotal() {
        Sandwich s = new Sandwich();
        Drinks d = new Drinks();
        Chips c = new Chips();
        Order o = new Order();

        System.out.println(o.getPrice());
        return "";
    }


    public float displayReceipt() {
        Sandwich sandwich = new Sandwich();
        Chips chips = new Chips();
        Drinks drinks = new Drinks();
        Transaction transaction = new Transaction();
        Order order = new Order();

//        sandwichSize = Sandwich.getSize();
//        chipsFlavor = chips.getFlavor();
//        drinksBrand = drinks.getBrand();
//        transcationOrder = transcation.calculateTotalPrice();

        getTotal();


        try {
            FileReader transactionFile = new FileReader("./src/main/java/com/sbat/transactions.txt");
            BufferedReader bufferedReader = new BufferedReader(transactionFile);

            System.out.println("Your order has been completed. ");


            try {
                FileWriter FileWriter = new FileWriter("./src/main/java/com/sbat/receipt.txt", true);
                FileWriter.write("\nOrder: " + s.getOrdersOfSandwich() + "|" + c.getOrdersOfChips() + "|" + d.getOrdersOfDrinks() + "| Total: " + getTotal());


                System.out.println(" Thank you, have a nice day. ");
            } catch (IOException e) {
                throw new RuntimeException("Order number cannot be found.", e);

            }
        } catch (IOException e) {
            throw new RuntimeException("Error, please try again later.", e);
        }
        return 0;
    }
    public static class Transaction{
        private float price;

        public Transaction(){}

        public Transaction(float price) {
            this.price = price;
        }







    }}
