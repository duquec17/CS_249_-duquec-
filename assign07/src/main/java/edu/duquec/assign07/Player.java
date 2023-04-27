package edu.duquec.assign07;

import edu.duquec.assign04.CharBoard;
import edu.duquec.assign06.Creature;

public class Player extends Creature {
    public Player() {

    }
    public Player(int row, int col) {
        super(row, col);
    }
    @Override
    public String toString() {
        return "Player at " + super.getRow() + "," + super.getCol();
    }
    public void draw(CharBoard map) {
        map.setPos(super.getRow(), super.getCol(), 'P');
    }

}
