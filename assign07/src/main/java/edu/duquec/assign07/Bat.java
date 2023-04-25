package edu.duquec.assign07;

import edu.duquec.assign04.CharBoard;
import edu.duquec.assign06.Creature;

public class Bat extends Creature implements Mover {
    //Empty Constructor
    public Bat() {

    }

    //Constructor passed row & columns position
    public Bat(int row, int col) {
        super(row, col);
    }

    //Tells where bat is located numerically
    public String toString() {
        return "Bats at " + getRow() + ", " + getCol();
    }

    //Displays Bat location on map
    public void draw(CharBoard map) {
        map.setPos(super.getRow(), super.getCol(), 'B');
    }

    //Moves bats away from player
    public void performMove(Player p) {
        new AvoidPlayer().move(this,p);
    }
}
