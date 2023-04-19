package edu.realemj.exercises15.observer;

import java.util.*;
public class Batsignal implements Subject {
    private ArrayList<Observer> allObs = new ArrayList<>();
    private String activeCrime = "nothing";

    public String getActiveCrime() {
        return activeCrime;
    }

    public void setActiveCrime(String crime) {
        activeCrime = crime;
        notifyObservers();
    }

    public void registerObserver(Observer obs) {
        allObs.add(obs);
    }

    public void removeObserver(Observer obs) {
        allObs.remove(obs);
    }

    public void notifyObservers() {
        for(Observer obs: allObs) {
            obs.update(this);
        }
    }
}
