package edu.realemj.exercises10;

import edu.realemj.math.Point2D;

public class Circle {
    private double radius = 1.0;
    private Point2D center = new Point2D(0,0);

    public Circle() {
        // Heading off to another constructor
        this(1.0, new Point2D(0,0));
    }

    public Circle(double radius) {
        this(radius, new Point2D(0,0));
        //setRadius(radius);
    }

    public Circle(double radius, Point2D center) {
        setRadius(radius);
        setCenter(center);
    }

    public double getRadius() {
        return radius;
    }

    public Point2D getCenter() {
        return new Point2D(center);
    }

    public void setRadius(double radius) {
        if(radius >= 0) {
            this.radius = radius;
        }
    }

    public void setCenter(Point2D center) {
        this.center = new Point2D(center);
    }

    public String toString() {
        return "Circle (r = " + radius + ") at " + center;
    }
}
