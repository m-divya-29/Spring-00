package com.snow.spring;

public class Circle implements Shape{
    public void setCenter(Point center) {
        this.center = center;
    }

    public Point center;
    public void draw(){
        System.out.println("Circle Drawn");
        System.out.println("Center "+center);
    }
}
