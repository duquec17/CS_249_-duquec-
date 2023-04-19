package edu.duquec.assign06;

import java.util.Scanner;

public abstract class Creature implements Loadable, Drawable{
    //Variable list
    private int row = 0;
    private int col = 0;

    //Constructor 1
    protected Creature() {
        //Empty
    }

    //Constructor 2
    protected Creature(int row, int col) {
        setRow(row);
        setCol(col);
    }

    //Gets the number of rows
    public int getRow() {
        return this.row;
    }

    //Gets the number of columns
    public int getCol() {
        return this.col;
    }

    //Assign row value
    public void setRow(int row) {
        this.row = row;
    }

    //Assign column value
    public void setCol(int col) {
        this.col = col;
    }

    //Loads the map
    @Override
    public void load(Scanner input)throws GameFileException {
        try {
            row = input.nextInt();
            col = input.nextInt();
        } catch(Exception e) {
            setRow(0);
            setCol(0);
            throw new GameFileException("Error loading Creature", e);
        }
    }
}
