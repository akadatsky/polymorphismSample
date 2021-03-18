package com.company.model;

public class Square extends BaseShape {

    public Square(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println("This is Square");
    }

}
