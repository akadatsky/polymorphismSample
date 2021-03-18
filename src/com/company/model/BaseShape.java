package com.company.model;

import com.company.Shape;

public abstract class BaseShape implements Shape {

    private int x;
    private int y;

    public BaseShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move() {
        x += 5;
        y += 5;
    }

    @Override
    public abstract void draw();

}
