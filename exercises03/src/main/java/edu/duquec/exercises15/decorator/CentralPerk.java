package edu.duquec.exercises15.decorator;

public class CentralPerk {
    public static void main(String [] arg) {

        Beverage b = new DarkRoast();
        b = new Whip(b);
        b = new Mocha(b);
        b = new Mocha(b);

        System.out.println(b.getDescription() + ": ");
    }
}
