package edu.realemj.exercises12;

import edu.realemj.math.*;
public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {}

    public Circle(double radius) {
        setRadius(radius);
    }

    public Circle(double radius, Point2D center) {
        setRadius(radius);
        setCenter(center);
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius >= 0) {
            this.radius = radius;
        }
    }
}
