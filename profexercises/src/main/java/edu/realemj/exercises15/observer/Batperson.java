package edu.realemj.exercises15.observer;

public class Batperson implements Observer {
    private String name;

    public Batperson(String name) {
        this.name = name;
    }

    public void update(Subject s) {
        if(s instanceof Batsignal b) {
            System.out.println("This is " + name + ", responding to " + b.getActiveCrime());
        }
        else if(s instanceof PoliceRadio p) {
            if(p.isACrime()) {
                System.out.println("This is " + name + "; the police got a call about " + p.getCall());
            }
            else {
                System.out.println("This is " + name + "; pretty quiet here.");
            }
        }

    }
}
