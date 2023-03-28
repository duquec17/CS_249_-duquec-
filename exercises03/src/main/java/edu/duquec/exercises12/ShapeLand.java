package edu.duquec.exercises12;

import edu.duquec.math.*;
public class ShapeLand {
    public static void main(String [] args) {

        Circle c = new Circle();
        Point2D p = c.getCenter();

        Circle c2 = new Circle(8.9, new Point2D(2,3));

        System.out.println(c2);

        Shape s = new Circle();
        System.out.println("BEFORE: " + s);
        s = new Shape();
        System.out.println("AFTER: " + s);

        Shape [] allShapes = new Shape[5];
        for(int i = 0; i < allShapes.length; i++) {
            if(i%2 == 0) {
                allShapes[i] = new Shape();
            }
            else {
                allShapes[i] = new Circle();
            }
        }

        System.out.println("ALL SHAPES:");
        for(Shape myShape: allShapes) {
            System.out.println(myShape);
        }
    }
}
