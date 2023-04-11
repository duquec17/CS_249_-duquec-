package edu.realemj.exercises14;

import edu.realemj.math.Point2D;

public abstract class Ellipsoid extends Shape {

    protected Ellipsoid() {}

    protected Ellipsoid(Point2D center, boolean filled) {
        super(center, filled);
    }
    public abstract Rectangle getBoundingBox();
}
