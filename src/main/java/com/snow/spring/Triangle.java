package com.snow.spring;

import java.util.List;

public class Triangle {
    List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    void draw(){
        System.out.println("Triangle drawn at: ");
        for (Point point :
                points) {
            System.out.print(point+" ");
        }


    }
}
