package edu.duquec.assign06;

import java.util.Scanner;

public class Item implements Loadable{
    //Variable List
    private String ID = "";
    private int value = 0;

    //Constructor
    public Item() {
    }

    public Item(String ID, int value) {
        setID(ID);
        setValue(value);
    }

    public String getID() {
        return ID;
    }

    public int getValue() {
        return value;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return ID + " with value " + value;
    }

    public void load(Scanner input) throws GameFileException{
        try{
            ID = input.next();
            value = input.nextInt();
        }catch (Exception e) {
            this.ID = "";
            this.value = 0;
            throw new GameFileException("Error loading Item", e);
        }
    }
}
