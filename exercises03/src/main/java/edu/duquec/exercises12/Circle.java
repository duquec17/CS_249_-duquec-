package edu.duquec.exercises12;

import edu.duquec.math.*;

public class Circle extends Shape{
    private double radius = 1.0;
    private Point2D center = new Point2D(0,0);

    public Circle(){}
    public Circle(double radius, Point2D center, boolean filled){
        super(center, filled);
        setRadius(radius);
    }
    public Circle(double radius){
        setRadius(radius);
    }

    public Circle(double radius, Point2D center){
        setRadius(radius);
        setCenter(center);
    }

    public Circle(double radius, Point2D center, boolean filled){
        setRadius(radius);
        setCenter(center);
        setFilled(filled);
    }

    public double getRadius(){return radius;}

    public void setCenter(Point2D center){
        this.center = new Point2D(center);
    }
    public void setRadius(double radius){
        if(radius >= 0){
            this.radius = radius;
        }
    }

    @Override
    public String toString(){
        String s = "";
        s += super.toString();
        s += "* Radius: " + radius + "\n";
        return s;
    }

}
