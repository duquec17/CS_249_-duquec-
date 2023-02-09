package edu.realemj.exercises03;

import java.util.*;
public class GeneralStore {

    public void printWelcome() {}
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
        }
    }

    public void printGoodbye() {}

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
