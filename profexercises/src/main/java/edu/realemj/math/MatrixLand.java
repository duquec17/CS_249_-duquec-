package edu.realemj.math;

public class MatrixLand {
    public static void main(String [] args) {
        Matrix2D m = Matrix2D.makeTranslate2D(2, 4);

        Point2D p = new Point2D(3, 14);

        Point2D q = m.multiply(p);

        System.out.println("p = " + p);
        System.out.println("q = " + q);
    }
}
