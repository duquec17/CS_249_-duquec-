package edu.duquec.exercises12;

import edu.duquec.math.*;

public class Circle {
    private double radius = 1.0;
    private Point2D center = new Point2D(0,0);

    public Circle(){}
    public Circle(double radius){
        setRadius(radius);
    }

    public Circle(double radius, Point2D center){
        setRadius(radius);
        setCenter(center);
    }

    public double getRadius(){return radius;}

    public void setRadius(double radius){
        if(radius >= 0){
            this.radius = radius;
        }
    }

    public void setCenter(Point2D center){
        this.center = new Point2D(center);
    }
}
