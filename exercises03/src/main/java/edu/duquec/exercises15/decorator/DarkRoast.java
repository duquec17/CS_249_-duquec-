package edu.duquec.exercises15.decorator;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        super("Dark Roast");
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
