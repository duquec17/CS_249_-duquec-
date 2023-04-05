package edu.duquec.assign04;

import java.util.Arrays;

public class CharBoard {
    private int rowCnt;
    private int colCnt;
    private char fillChar;
    private char[][] arrayChar;

    public CharBoard(int rowCnt, int colCnt, char fillChar){
        //Obtains array limit
        this.colCnt = colCnt;
        this.rowCnt = rowCnt;
        this.fillChar = fillChar;

        //Loops through array & fills it w/char
        clear();
    }

    //Clears array board
    public void clear(){
        this.arrayChar = new char[rowCnt][colCnt];
        //Reset
        for(int i = 0; i < getRowCnt(); i++){
            for(int j = 0; j < getColCnt(); j++){
               arrayChar[i][j] = fillChar;
            }
        }
    }

    //Get row limit
    public int getRowCnt() {
        return rowCnt;
    }

    //Gets col limit
    public int getColCnt(){
        return colCnt;
    }

    public boolean isValidPosition(int row, int col){
        if((row >= 0 && col >= 0) && (row < rowCnt && col < colCnt)){
            return true;
        }
        return false;
    }

    //Gets position of character
    public char getPos(int row, int col){
        if (isValidPosition(row, col)){
            return arrayChar[row][col];
        }
        return ' ';
    }

    //Sets position after determining true/false
    public boolean setPos(int row, int col, char c){
        if (isValidPosition(row, col)){
            arrayChar[row][col] = c;
            return true;
        }
        return false;
    }

    //Displays info
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(rowCnt);
        sb.append(" x ");
        sb.append(colCnt + " edu.duquec.assign04.CharBoard ");
        sb.append("(default: ");
        sb.append(fillChar + ")");
        return sb.toString();
    }

    public String getMapString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < getRowCnt(); i++){
            for (int j = 0; j < getColCnt(); j++){
                sb.append(arrayChar[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

