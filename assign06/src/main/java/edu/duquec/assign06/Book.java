package edu.duquec.assign06;

import java.util.Scanner;

public class Book extends Item{
    //Variable List
    private String skill = "";

    //Constructor 1 (Empty)
    public Book() {
        //Empty
    }

    //Constructor 2
    public Book(String ID, int value, String skill) {
        super(ID, value);
        this.skill = skill;
    }

    //Returns skill
    public String getSkill() {
        return skill;
    }

    //Set Skill
    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void read() {
        System.out.println("Skill " + skill + " increased!");
    }

    //Informs player type of book enhancement
    @Override
    public String toString() {
        return super.toString() + ", enhances " + skill;
    }

    //Loads the map
    @Override
    public void load(Scanner input) throws GameFileException {
        try {
            super.load(input);
            this.skill = input.next();
        } catch(Exception e) {
            super.setID("");
            super.setValue(0);
            this.skill = "";
            throw new GameFileException("Error loading Book", e);
        }
    }
}
