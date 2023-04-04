package edu.realemj.math;

public class Point3D {
    private double x;
    private double y;
    private double z;

    public Point3D() {}

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D(Point3D other) {
        this.x = other.x;
        this.y = other.y;
        this.z = other.z;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public double getZ() { return z; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    public void setZ(double z) { this.z = z; }

    public double get(int index) {
        double val = switch(index) {
            case 0 -> x;
            case 1 -> y;
            case 2 -> z;
            case 3 -> 1;
            default -> 0;
        };
        return val;
    }

    public void set(int index, double val) {
        switch(index) {
            case 0 -> x = val;
            case 1 -> y = val;
            case 2 -> z = val;
            default -> {}
        }
    }

    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }

    public String objString() {
        return "v " + x + " " + y + " " + z;
    }

    private static boolean sameValue(double a, double b) {
        double diff = Math.abs(a - b);
        final double EPS = 1e-8;
        return (diff <= EPS);
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Point3D po) {
            if(sameValue(x, po.x) && sameValue(y, po.y) && sameValue(z, po.z)) {
                return true;
            }
        }

        return false;
    }

}
