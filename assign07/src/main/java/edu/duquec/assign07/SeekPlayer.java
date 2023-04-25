package edu.duquec.assign07;

import edu.duquec.assign06.Creature;
import edu.duquec.assign06.Rat;

public class SeekPlayer implements MoveAlgorithm {
    //Variables list
    private int creatureRow;
    private int creatureCol;
    private int playerRow;
    private int playerCol;
    private int rowDistance;
    private int colDistance;

    public void move(Creature current, Player p) {

        //Get values values
        creatureRow = current.getRow();
        creatureCol = current.getCol();

        playerRow = p.getRow();
        playerCol = p.getCol();

        //Checks to see if creature is not on top of player (Cower)
       if(creatureRow != playerRow || creatureCol != playerCol) {

           //Acquires distances between creature and player
            rowDistance = creatureRow - playerRow;
            colDistance = creatureCol - playerCol;
       }

            //If distance is not zero
            if (rowDistance != 0 || colDistance != 0) {

                //If absolute value of row is greater than
                //absolute value of columns
                if (Math.abs(rowDistance) > Math.abs(colDistance)) {
                    if (rowDistance < 0) {

                        //Move creature up
                        creatureRow++;
                        current.setRow(creatureRow);

                    } else if (rowDistance > 0) {

                        //Move creature down
                        creatureRow--;
                        current.setRow(creatureRow);
                    }
                } else {
                    if (colDistance < 0) {

                        //Move creature left
                        creatureCol++;
                        current.setCol(creatureCol);
                    } else if (colDistance > 0) {

                        //Move creature right
                        creatureCol--;
                        current.setCol(creatureCol);
                    }
                }
            }
    }
}