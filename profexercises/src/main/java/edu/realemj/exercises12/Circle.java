package edu.realemj.exercises12;

import edu.realemj.math.*;
public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
        // super();
    }

    public Circle(double radius) {
        // super();
        setRadius(radius);
    }

    public Circle(double radius, Point2D center) {
        this(radius);
        setCenter(center);
    }

    public Circle(double radius, Point2D center, boolean filled) {
        super(center, filled);
        setRadius(radius);
        //setCenter(center);
        //setFilled(filled);
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius >= 0) {
            this.radius = radius;
        }
    }

    @Override
    public String toString() {
        String s = "";
        s += super.toString();
        s += "* Radius: " + radius + "\n";
        return s;
    }
}
