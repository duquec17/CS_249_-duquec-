package edu.duquec.exercises15.observer;

import java.util.Observer;

public interface Subject {
    void registerObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers();
}
