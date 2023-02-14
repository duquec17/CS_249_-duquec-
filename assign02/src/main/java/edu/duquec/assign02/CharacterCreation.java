package edu.duquec.assign02;

import java.util.Scanner;

public class CharacterCreation {
    public static void main(String [] args){
        // Creates scanner to read from system.in
        Scanner input = new Scanner(System.in);

        // Creates player identity
        Player p = new Player();

        // Asks for name
        System.out.println("Enter name: ");

        // Reads first name into string
        p.setFirstName(input.next());

        // Reads last name into string
        p.setLastName(input.next());

        // Asks for height
        System.out.println("Enter height in inches: ");

        // Reads height as int
        p.setHeight(input.nextInt());

        // Asks for weight
        System.out.println("Enter weight in pounds: ");
        p.setWeight(input.nextDouble());

        //Print out value returns from p String
        System.out.println(p.toString());


    }
}
