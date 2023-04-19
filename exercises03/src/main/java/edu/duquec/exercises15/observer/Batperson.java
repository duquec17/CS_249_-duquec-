package edu.duquec.exercises15.observer;

public class Batperson implements Observer{

    private String name;
    public Batperson(String name) {
        this.name = name;
    }

    public void update(Subject s) {
        if(s instanceof Batsignal b) {
            System.out.println("This is " + name + ". respdoning to " +b.getActiveCrime());
        }
        else if(s instanceof PoliceRadio p) {
            if(p.isACrime()) {
                System.out.println("This is " + name + ": the police got a call about");
            }
        }
    }
}
