package com.company;

public abstract class Shape {
    double x;
    double y;

    Shape(double x, double y){
        this.x = x;
        this.y = y;
    }

    public abstract double getPerimetr();
}

