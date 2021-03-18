package com.company;

import com.company.model.Circle;
import com.company.model.Square;
import com.company.model.Triangle;

import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {

    public static List<Shape> getShapes() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(10, 20));
        shapes.add(new Square(10, 20));
        shapes.add(new Triangle(10, 20));
        return shapes;
    }

}
