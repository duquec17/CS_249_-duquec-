package edu.realemj.exercises14;

import edu.realemj.exercises13.InvalidRadiusException;
import edu.realemj.math.Point2D;

public class Circle extends Ellipsoid
        implements Comparable<Circle> {
    private double radius = 1.0;

    public int compareTo(Circle other) {
        if(this.equals(other)) {
            return 0;
        }
        else if(radius < other.radius) {
            return -1;
        }
        else {
            return +1;
        }
    }

    public Circle() {
        // super();
    }

    public Circle(double radius) throws InvalidRadiusException {
        // super();
        setRadius(radius);
    }

    public Circle(double radius, Point2D center) throws InvalidRadiusException {
        this(radius);
        setCenter(center);
    }

    public Circle(double radius, Point2D center, boolean filled)
            throws InvalidRadiusException {

        super(center, filled);
        setRadius(radius);
        //setCenter(center);
        //setFilled(filled);
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException {
        if(radius >= 0) {
            this.radius = radius;
        }
        else {
            throw new InvalidRadiusException("Negative radius! " + radius);
        }
    }

    @Override
    public String toString() {
        String s = "";
        s += super.toString();
        s += "* Radius: " + radius + "\n";
        return s;
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Circle oc) {
            double diff = Math.abs(radius - oc.radius);
            final double EPS = 1e-8;

            if(diff <= EPS && super.equals(oc)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2.0*radius;
    }

    @Override
    public Rectangle getBoundingBox() {
        Rectangle bb = new Rectangle(2*radius, 2*radius);
        return bb;
    }
}
