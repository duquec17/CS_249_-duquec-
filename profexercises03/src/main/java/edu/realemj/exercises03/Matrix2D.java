package edu.realemj.exercises03;

public class Matrix2D {
    private double [][] data;

    public Matrix2D(int r, int c) {
        reallocate(r, c);
    }

    public int getRowCnt() {
        return data.length;
    }

    public int getColCnt() {
        return data[0].length;
    }

    public void reallocate(int r, int c) {
        data = new double[r][c];
    }
}
