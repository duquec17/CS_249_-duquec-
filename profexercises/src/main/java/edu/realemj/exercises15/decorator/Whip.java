package edu.realemj.exercises15.decorator;

public class Whip extends Condiment {
    private Beverage inside;

    public Whip(Beverage b) {
        inside = b;
    }

    public double cost() {
        return inside.cost() + 0.10;
    }

    public String getDescription() {
        return inside.getDescription() + ", whip";
    }
}
