package com.snow.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Triangle implements Shape,InitializingBean, DisposableBean {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }
    @Autowired
    @Qualifier("circlerelated")
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw(){
        System.out.println("Triangle drawn at: ");
        System.out.println(pointA+", "+pointB+", "+pointC);
    }
    //In order for this to be called, must registerShutdownHook on the app context.
    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable bean destroy called.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean afterPropertiesSet method called.");
    }
    public void customInit(){
        System.out.println("Custom init called.");
    }
    public void customDestroy(){
        System.out.println("Custom destroy called.");
    }
}
