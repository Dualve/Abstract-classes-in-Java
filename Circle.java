package com.company;

public class Circle extends Shape {
    private double r;
    private double PI = 3.14;

    Circle(double x, double y, double r){
        super(x,y);
        this.r = r;
    }

    public double getPerimetr(){
        return 2*PI*r;
    }
}
