package com.project.geometry;

import java.awt.geom.Ellipse2D;

public class Circle extends Ellipse2D.Double {
    public Circle(double x, double y, double r) {
        super(x, y, r, r);
    }

    public double getArea() {
        return Math.PI * width * width;
    }
}
