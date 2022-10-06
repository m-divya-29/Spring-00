package com.snow.spring;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{
    @Required
    public void setCenter(Point center) {
        this.center = center;
    }

    public Point center;
    public void draw(){
        System.out.println("Circle Drawn");
        System.out.println("Center "+center);
    }
}
