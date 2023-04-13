package edu.duquec.assign05;

import java.util.ArrayList;
import java.util.*;

public class Woods{
    //Variables
    private ArrayList <Giant> woodArmy = new ArrayList<>();

    public Giant createGiant(String name, String typeName) {

        //Empty String returns null
        if(name.length() == 0) {
            return null;
        }

        //Initialize Giant specific
        Giant spec;

        //Case list based on type name of giant
        switch(typeName) {

            //GIANT
            case "GIANT" -> {
                //Define spec to a new giant name
                spec = new Giant(name);
            }

            //TROLL
            case "TROLL" -> {
                //Define spec to a new troll name
                spec = new Troll(name);
            }

            //TREE
            case "TREE" -> {
                //Define spec to a new tree name
                spec = new Tree(name);
            }

            //ENT
            case "ENT" -> {
                //Define spec to a new ent name
                spec = new Ent(name);
            }

            //HUORN
            case "HUORN" -> {
                //Define spec to a new huorn name
                spec = new Huorn(name);
            }
            //Else
            default -> {
                return null;
            }
        }

        //Return created object i.e (Troll/TREE/ETC.
        return spec;
    }

    public boolean addGiant(String name, String typeName) {
        //Set spec to created giant
        Giant spec = createGiant(name, typeName);

        //Initialize variable
        boolean isNull = false;

        //If spec's has a value
        if(spec != null){
            //Add the object to the arraylist
            woodArmy.add(spec);

            //Set boolean value to true
            isNull = true;
        }

        //Return boolean
        return isNull;
    }

    public Giant getGiant(int index) {
        //Checks if index is within range
        if(index >= 0 && index < woodArmy.size()) {
            //Return the object(giant creature) to the index
            return woodArmy.get(index);
        }

            //If not within range return null
            return null;
    }

    public void printAllGiants() {
        //Print out all the Giant type in the list
        System.out.println("ALL GIANTS:");
        for(Giant spec : woodArmy) {
            System.out.println("- " + spec.toString());
        }
    }

    public void printAllTrees() {
        //Print out all the Tree type in the list
        System.out.println("ALL TREES:");
        for(Giant spec : woodArmy) {
            if(spec instanceof Tree t) {
                System.out.println("- " + t.toString() + ": " + t.speak());
            }

        }
    }

    public void printAllTrolls() {
        //Print out all the Tree type in the list
        System.out.println("ALL TROLLS:");
        for(Giant spec : woodArmy) {
            if(spec instanceof Troll t) {
                System.out.println("- " + t.toString() + ": " + t.cook());
            }
        }
    }

}
