package edu.realemj.exercises03;

import java.util.*;
public class GeneralStore {

    public void printWelcome() {
        System.out.println("***********************");
        System.out.println("** WELCOME!!!!");
        System.out.println("***********************");
    }
    public void printOptions() {
        System.out.println("** INVENTORY **");
        System.out.println("* Food");
        System.out.println("What do you want to buy?");
    }

    public void updateSupplies(Supplies s, String request) {
        if(request.trim().length() > 0) {
            Scanner tokens = new Scanner(request);
            int cnt = tokens.nextInt();
            String item = tokens.next();
            item = item.toLowerCase();

            switch(item) {
                case "food" -> {
                    s.addFood(cnt);
                }
                default -> {
                    System.out.println("I'm sorry, but we don't carry: " + item);
                }
            }
        }
    }

    public void printGoodbye() {
        System.out.println("*****************************");
        System.out.println("** THANK YOU; COME AGAIN!!!!");
        System.out.println("*****************************");
    }

    public void visit(Scanner input, Supplies s) {
        // Welcome
        printWelcome();

        // While they're not done
        String userRequest = "";
        do {
            // List options
            printOptions();

            // Ask user what to buy
            userRequest = input.nextLine();

            // Add to supplies
            updateSupplies(s, userRequest);

            // Print their supplies
            System.out.println(s);

        }while(userRequest.length() != 0);

        // Goodbye
        printGoodbye();
    }

    public static void main(String [] args) {
        GeneralStore store = new GeneralStore();
        Supplies s = new Supplies();
        Scanner input = new Scanner(System.in);
        store.visit(input, s);
    }
}
