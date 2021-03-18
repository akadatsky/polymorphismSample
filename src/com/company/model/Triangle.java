package com.company.model;

public class Triangle extends BaseShape{


    public Triangle(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println("This is Triangle");
    }

}
