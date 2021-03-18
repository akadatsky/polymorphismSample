package com.company.model;

public class Circle extends BaseShape {

    public Circle(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println("This is Circle");
    }

}
