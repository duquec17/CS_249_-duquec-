package edu.duquec.assign06;

import edu.duquec.assign04.*;

public class Rat extends Creature {
    //Constructor 1 (Empty)
    public Rat() {

    }

    public Rat(int row, int col) {
        super(row, col);
    }

    @Override
    public String toString() {
        return "Rat at " + super.getRow() + "," +super.getCol();
    }

    //Displays Rat location
    public void draw(CharBoard map) {
        map.setPos(super.getRow(), super.getCol(), 'R');
    }


}
