package edu.realemj.exercises14;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }

    public double getArea() {
        return width*height;
    }

    public double getPerimeter() {
        return 2*width + 2*height;
    }
}
