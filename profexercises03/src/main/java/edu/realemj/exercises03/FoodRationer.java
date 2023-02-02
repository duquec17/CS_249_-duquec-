package edu.realemj.exercises03;

public class FoodRationer {
    public static void main(String [] args) {
        System.out.println("Welcome to the trail!");

        double totalFood = 100;
        int partyCnt = (int)5.0;
        double rations = 10;

        double daysLeft = totalFood/(partyCnt*rations);
        System.out.println("DAYS LEFT: " + daysLeft);

    }
}
