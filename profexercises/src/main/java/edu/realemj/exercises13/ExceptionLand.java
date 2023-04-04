package edu.realemj.exercises13;

import java.io.*;
import java.util.*;
public class ExceptionLand {
    public static void main(String [] args) {
        try {
            loadFile("myfile.txt");
        }
        catch(IOException e) {
            System.err.println("Error with loading file!");
            e.printStackTrace();
        }

        try {
            calculator();
        }
        catch(Exception e) {
            System.err.println("HELP!!!!!!");
            e.printStackTrace();
        }

        System.out.println("DONE");
    }

    public static void calculator() throws Exception {
        Scanner input = new Scanner(System.in);
        try {
            int x = input.nextInt();
            int y = input.nextInt();
            int result = x / y;
            System.out.println(result);
            String s = null;
            System.out.println("Length: " + s.length());
        }
        catch(InputMismatchException m) {
            System.err.println("Wrong kind of input!");
            //throw m;
            throw new Exception("The user is being silly", m);
        }
        catch(ArithmeticException m) {
            System.err.println("Bad math!");
        }
        catch(Exception e) {
            System.err.println("Something went awry!");
        }
    }

    public static void loadFile(String filename) throws IOException {
        throw new IOException("I don't know file IO -_-'");

        /*
        try {
            throw new IOException("I don't know file IO -_-'");
        }
        catch(IOException e) {
            System.err.println(e.getMessage());
        }
        */
    }

}
