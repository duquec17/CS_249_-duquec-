package edu.duquec.exercises15.observer;

import java.util.ArrayList;
import java.util.Observer;

public class Batsignal implements Subject {
    private ArrayList<java.util.Observer> allObs = new ArrayList<>();
    private String activeCrime = "nothing";

    public String getActiveCrime() {
        return activeCrime;
    }

    public void setActiveCrime(String crime) {
        activeCrime = crime;
        notifyObservers();
    }

    public void registerObserver(java.util.Observer obs) {
        allObs.add(obs);
    }

    public void removeObserver(java.util.Observer obs) {
        allObs.remove(obs);
    }

    public void notifyObservers() {
        for(Observer obs: allObs) {
            obs.update(this);
        }
    }
}
