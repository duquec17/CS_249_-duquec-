package edu.duquec.exercises03;

public class Matrix2D {
    private double [][] data;
    //private int rowCnt;
    //private int colCnt;

    public Matrix2D(int r, int c){
        //data = new double[r][c];
        reallocate(r, c);
    }

    public int getRowCnt(){
        //return rowCnt;
        return data.length;
    }

    public int getColCnt(){
        //return colCnt;
        return data[0].length;
    }

    public void reallocate(int r, int c){
        data = new double[r][c];
        //rowCnt = r;
    }
}
