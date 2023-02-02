package edu.duquec.exercises03;
import java.util.Scanner;

public class FoodRationer {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the trail!");

        System.out.println("Enter total food:");
        double totalFood = input.nextDouble();
        System.out.println("Enter number of people:");
        int partyCnt = input.nextInt();
        double rations = 10;

        double daysLeft = totalFood/(partyCnt*rations);
        System.out.println("DAYS LEFT: " + daysLeft);

        double y =2.0;
        int x = 10;
        x = (int)(x/y);
    }
}
