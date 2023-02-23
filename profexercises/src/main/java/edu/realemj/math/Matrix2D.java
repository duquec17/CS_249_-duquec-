package edu.realemj.math;

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

    public double get(int r, int c) {
        return data[r][c];
    }

    public void set(int r, int c, double val) {
        data[r][c] = val;
    }

    public static Matrix2D makeTranslate2D(double ox, double oy) {
        Matrix2D m = new Matrix2D(3,3);
        m.set(0,0,1);
        m.set(1,1,1);
        m.set(2,2,1);

        m.set(0, 2, ox);
        m.set(1, 2, oy);

        return m;
    }

    public Point2D multiply(Point2D p) {
        Point2D r = new Point2D();
        for(int i = 0; i < getRowCnt(); i++) {
            double sum = 0;
            for(int j = 0; j < getColCnt(); j++) {
                double mval = get(i,j);
                double pval = p.get(j);
                double rval = mval*pval;
                sum += rval;
            }
            r.set(i, sum);
        }
        return r;
    }
}
