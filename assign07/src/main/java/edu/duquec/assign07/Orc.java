package edu.duquec.assign07;

import edu.duquec.assign04.CharBoard;
import edu.duquec.assign06.Creature;

public class Orc extends Creature implements Mover {
    //Empty Constructor
    public Orc() {

    }

    //Constructor passed row & columns position
    public Orc(int row, int col) {
        super(row, col);
    }

    //Tells where orc is located numerically
    public String toString() {
        return "Orc at " + getRow() + ", " + getCol();
    }

    //Displays orc location on map
    public void draw(CharBoard map) {
        map.setPos(super.getRow(), super.getCol(), 'O');
    }

    //Moves bat
    public void performMove(Player p) {
        new SeekPlayer().move(this,p);
    }
}
