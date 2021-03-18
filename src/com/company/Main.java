package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = ShapeFactory.getShapes();
        drawAll(shapes);
    }

    private static void drawAll(List<Shape> shapes) {
        for (Shape shape : shapes) {
            shape.move();
            shape.draw();
        }
    }

}
