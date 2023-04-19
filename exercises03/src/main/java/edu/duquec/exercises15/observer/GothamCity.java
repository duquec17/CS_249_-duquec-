package edu.duquec.exercises15.observer;

public class GothamCity {
    public static void main(String [] args) {
        Batperson bruce = new Batperson("Batman");
        Batperson dick = new Batperson("Nightwing");
        Batperson barb = new Batperson("Batgirl");
        Batperson tim = new Batperson("Robin");

        Batsignal signal = new Batsignal();
        PoliceRadio radio = new PoliceRadio;

        signal.reigsterObserver(bruce);
        signal.reigsterObserver(dick);
        signal.reigsterObserver(barb);
        signal.reigsterObserver(tim);

        radio.registerObserver(barb);

        signal.setActiveCrime("a robber");

        signal.removeObserver(dick);

        signal.setActiveCrime("a complicated plot involving two boats");

        radio.gotCall("arson", true);
        radio.gotCall("cat in tree", false);

        Superperson clark = new Superperson("Superman");
        signal.registerObserver(clark);
        signal.setActiveCrime("Godzilla");
    }
}
