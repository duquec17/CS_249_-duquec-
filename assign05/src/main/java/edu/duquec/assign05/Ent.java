package edu.duquec.assign05;

public class Ent extends Tree {
    //Ent Constructor
    public Ent(String name) {
        super(name);
    }

    @Override
    //Displays Ent and parent method of to string
    public String toString() {
        return "Ent " + super.toString();
    }

    @Override
    //Displays spoken message
    public String speak(){
        return "HOOM";
    }
}
