package com.snow.spring;

public class Triangle {
    private String type;
    private int height;

    Triangle(int height){
        this.height = height;
    }
    Triangle(String type){
        this.type = type;
    }
    Triangle(int height, String type){
        this.height = height;
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


    void draw(){
        System.out.println("Triangle drawn");
    }
}
