package edu.duquec.exercises12;

import edu.duquec.math.*;
import edu.duquec.exercises13.InvalidRadiusException;
public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
        // super();
    }

    public Circle(double radius) throws InvalidRadiusException{
        // super();
        setRadius(radius);
    }

    public Circle(double radius, Point2D center) throws InvalidRadiusException{
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
        if(other instanceof Circle oc){
            double diff = Math.abs(radius - oc.radius);
            final double EPS = 1e-8;

            //oc can be replaced with other
            if(diff <= EPS && super.equals(oc)) {
                return true;
            }
        }

        return false;
    }
}
