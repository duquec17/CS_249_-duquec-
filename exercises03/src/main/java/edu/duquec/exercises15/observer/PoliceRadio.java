package edu.duquec.exercises15.observer;

import java.util.ArrayList;

public class PoliceRadio implements Subject{
        private ArrayList<Observer> allObs = new ArrayList<>();
        private String call = "nothing";
    private boolean isACrime;

    public boolean isACrime() {
            return isACrime();
        }

        public void gotCall(String call, boolean isACrime) {
            this.call = call;
            this.isACrime = isACrime;
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
}
