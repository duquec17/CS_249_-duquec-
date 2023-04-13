package edu.duquec.assign05;

//Extends allow use of Giant class functions
public class Troll extends Giant{

    //Troll Constructor
    public Troll (String name) {
        super(name);
    }

    @Override
    //Displays Troll and using toString from parent function (Giant)
    public String toString() {
        return "Troll " + super.toString();
    }

    //Displays message Cook message
    public String cook() {
        return "Mutton again...";
    }
}
