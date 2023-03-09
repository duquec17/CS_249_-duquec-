package edu.duquec.assign04;

public class CharBoard {
    private int rowCnt;
    private int colCnt;
    private char fillChar;
    private String arrayChar;

    public CharBoard(int rowCnt, int colCnt, char fillChar){

    }

    public int getRowCnt() {
        return rowCnt;
    }
    public int getColCnt(){
        return colCnt;
    }

    public boolean isValidPosition(int row, int col){

        return false;
    }

    public char getPos(int row, int col){

        return ' ';
    }

    public boolean setPos(int row, int col, char c){

        return false;
    }

    public String toString() {

        return toString();
    }

    public String getMapString(){

        return arrayChar;
    }
}
