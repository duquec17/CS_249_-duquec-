package edu.realemj.exercises15.observer;

public class GothamCity {
    public static void main(String [] args) {
        Batperson bruce = new Batperson("Batman");
        Batperson dick = new Batperson("Nightwing");
        Batperson barb = new Batperson("Batgirl");
        Batperson tim = new Batperson("Robin");

        Batsignal signal = new Batsignal();
        PoliceRadio radio = new PoliceRadio();

        signal.registerObserver(bruce);
        signal.registerObserver(dick);
        signal.registerObserver(barb);
        signal.registerObserver(tim);

        radio.registerObserver(barb);

        signal.setActiveCrime("a robbery");

        signal.removeObserver(dick);

        signal.setActiveCrime("a complicated plot involving two boats");

        radio.gotCall("arson", true);
        radio.gotCall("cat in tree", false);

        Superperson clark = new Superperson("Superman");
        signal.registerObserver(clark);
        signal.setActiveCrime("Godzilla");
    }
}
