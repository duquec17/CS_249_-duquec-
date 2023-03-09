package edu.realemj.exercises12;

import edu.realemj.math.*;
public class Shape {
    private boolean filled;
    private Point2D center = new Point2D(0,0);

    public Shape() {}

    public Shape(Point2D center) {
        this.center = new Point2D(center);
    }

    public Shape(Point2D center, boolean filled) {
        this(center);
        this.filled = filled;
    }

    public boolean isFilled() { return filled; }
    public void setFilled(boolean f) { filled = f; }

    public Point2D getCenter() {
        return new Point2D(center);
    }

    public void setCenter(Point2D center) {
        this.center = new Point2D(center);
    }
}
