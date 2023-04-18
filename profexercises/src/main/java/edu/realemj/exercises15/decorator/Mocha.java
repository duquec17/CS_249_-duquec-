package edu.realemj.exercises15.decorator;

public class Mocha extends Condiment {
    private Beverage inside;

    public Mocha(Beverage b) {
        inside = b;
    }

    public double cost() {
        return inside.cost() + 0.20;
    }

    public String getDescription() {
        return inside.getDescription() + ", mocha";
    }
}
