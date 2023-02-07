package edu.duquec.exercises03;
import java.util.*;

public class FoodRationer {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Supplies s = new Supplies();

        System.out.println("Welcome to the trail!");

        System.out.println("Enter total food:");
        s.addFood(input.nextDouble());

        boolean enoughFood = (s.getTotalFood() > 100);

        while(!enoughFood){
            System.out.println("Are you crazy!?!?");
            System.out.println("Enter total food:");
            s.setTotalFood(input.nextDouble());
            enoughFood = (s.getTotalFood() > 100);
        }

        System.out.println("Enter number of people:");
        int partyCnt = input.nextInt();
        double rations = 10;

        double daysLeft = s.getTotalFood()/(partyCnt*rations);
        System.out.println("DAYS LEFT: " + daysLeft);

        double y = 2.0;
        int x = 10;
        x = (int)(x/y);

        /* Apply to new Java program called Rando
        String t = null;
        System.out.println(t);
        System.out.println(t.length());


        String s = "";
        System.out.println(s);
        System.out.print(s.length());

        char c = s.charAt(0);
         */

    }
}
