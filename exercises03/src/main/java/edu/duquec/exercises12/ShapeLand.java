package edu.duquec.exercises12;

import edu.duquec.exercises10.Circle;
import edu.duquec.math.*;

public class ShapeLand {
    public static void main(String [] args){
        Circle c = new Circle();
        Point2D p = c.getCenter();

        Circle c2 = new Circle(8.9, new Point2D(2,3));
    }
}
