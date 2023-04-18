package edu.duquec.assign06;

import edu.duquec.assign04.*;

public class Skeleton extends Creature {
    //Constructor 1 (Empty)
    public Skeleton(){

    }

    public Skeleton(int row, int col) {
        super(row,col);
    }

    @Override
    public String toString() {
        return "Skeleton at " + super.getRow() + "," + super.getCol();
    }

    //
    public void draw(CharBoard map) {
        map.setPos(super.getRow(), super.getCol(), 'S');
    }
}
