package edu.duquec.exercises15.decorator;

public abstract class Beverage {
    private String desc = "";

    protected Beverage() {}

    protected Beverage(String desc) {
        this.desc = desc;
    }
    protected String getDescription() {
        return desc;
    }

    public abstract double cost();
}