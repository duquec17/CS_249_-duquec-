package edu.duquec.assign03;

import java.util.Scanner;

public class LetterPrinter {
    public static Letterhead askForLetterheadData(Scanner input){
        // Asks user for the business name input
        System.out.println("Enter business name:");

        // Records next user input into string
        String name = input.nextLine();

        // Asks user for the boundary character input
        System.out.println("Enter boundary character:");

        // Records next user input into string & splits
        String boundary = input.nextLine();
        char characterBoundary = boundary.charAt(0);

        // Generates string array to hold slogan lines
        String [] sloganLines = new String[4];

        // Asks for user slogan inputs
        System.out.println("Enter slogan (max 4 lines):");

        // Fills sloganLines array with inputs
        for(int i = 0; i < 4; ++i){
            sloganLines[i] = input.nextLine();
        }

        // Gives data to constructor
        Letterhead lh = new Letterhead(name, sloganLines, characterBoundary);

        return lh;
    }

    public static void main (String[]args){
        // Generates scanner *Scanner is used in above Letterhead function
        Scanner input = new Scanner(System.in);

        // Letterhead object made using A.F.L.H.D function
        Letterhead header = askForLetterheadData(input);

        // Prints new letterhead
        System.out.println("Your new letterhead:");
        System.out.println(header.toString());

    }

}
