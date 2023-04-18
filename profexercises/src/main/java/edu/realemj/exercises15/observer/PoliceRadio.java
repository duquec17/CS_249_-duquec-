package edu.realemj.exercises15.observer;

import java.util.ArrayList;

public class PoliceRadio implements Subject {
    private ArrayList<Observer> allObs = new ArrayList<>();
    private String call = "nothing";
    private boolean isCrime = false;

    public String getCall() {
        return call;
    }

    public boolean isACrime() {
        return isCrime;
    }

    public void gotCall(String call, boolean isCrime) {
        this.call = call;
        this.isCrime = isCrime;
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
