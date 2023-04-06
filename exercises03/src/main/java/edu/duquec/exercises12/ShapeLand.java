package edu.duquec.exercises12;

import edu.duquec.exercises13.InvalidRadiusException;
import java.util.*;
import edu.duquec.math.*;
public class ShapeLand {
    public static void main(String [] args) {

        try {
            Circle c = new Circle();
            Point2D p = c.getCenter();

            Circle c2 = new Circle(8.9, new Point2D(2, 3));

            System.out.println(c2);

            Shape s = new Circle();
            System.out.println("BEFORE: " + s);
            s = new Shape();
            System.out.println("AFTER: " + s);

            Shape[] allShapes = new Shape[5];
            for (int i = 0; i < allShapes.length; i++) {
                if (i % 2 == 0) {
                    allShapes[i] = new Shape();
                } else {
                    allShapes[i] = new Circle();
                }
            }

            System.out.println("ALL SHAPES:");
            for (Shape myShape : allShapes) {
                System.out.println(myShape);
            }
        } catch (InvalidRadiusException re) {
            System.err.println("Bad radius!");
        }
        try {
            double radius = -1.0;
            Scanner input = new Scanner(System.in);

            //You can remove the word Circle in new ArrayList, but not the arrows
            ArrayList<Circle> allCircles = new ArrayList<Circle>();
            do {
                System.out.println("Enter radius (negative for stop):");
                radius = input.nextDouble();
                if (radius >= 0.0) {
                    Circle oneCircle = new Circle(radius);
                    allCircles.add(oneCircle);
                }
            } while (radius >= 0.0);

            System.out.println("Number of circles: " + allCircles.size());

            if (allCircles.size() >= 3) {
                Circle aCircle = allCircles.get(2);
                aCircle.setRadius(100);
                aCircle = new Circle(5000); //This does nothing
            }

            if (allCircles.size() >= 1) {
                allCircles.set(0, new Circle(9001));
            }

            Circle anotherCircle = new Circle(9001);
            System.out.println();

            if (allCircles.size() >= 1) {
                Circle oldOne = allCircles.remove(0);
                System.out.println("Removed: " + oldOne.getRadius());
            }

            System.out.println("ALL CIRCLES:");
            System.out.println("Number of circles now: " + allCircles.size());
            for (Circle oneCircle : allCircles) {
                System.out.println("* " + oneCircle.getRadius());
            }

            allCircles.clear();

            System.out.println("Number of circles now: " + allCircles.size());
        } catch (InvalidRadiusException re) {
            System.err.println("Bad radius!");
        }
    }
}
