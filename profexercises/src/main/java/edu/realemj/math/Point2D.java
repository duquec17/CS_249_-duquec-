package edu.realemj.math;

public class Point2D {
    private double x;
    private double y;

    public Point2D() {}

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(Point2D other) {
        this.x = other.x;
        this.y = other.y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    public double get(int index) {
        double val = switch(index) {
            case 0 -> x;
            case 1 -> y;
            case 2 -> 1;
            default -> 0;
        };
        return val;
    }

    public void set(int index, double val) {
        switch(index) {
            case 0 -> x = val;
            case 1 -> y = val;
            default -> {}
        }
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
