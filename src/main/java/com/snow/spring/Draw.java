package com.snow.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Draw {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        BeanFactory beanFactory = context;
        System.out.println("----------------Triangle 1-------------------");
        Triangle triangle = (Triangle) beanFactory.getBean("triangle-alias");
        // triangle.setPointA((Point)beanFactory.getBean("point1")); -->  instead of this, object injection can be done from spring.xml itself
        triangle.draw();
        System.out.println("----------------Triangle 2-------------------");
        Triangle triangle1 = (Triangle) beanFactory.getBean("triangle2");
        triangle1.draw();
    }
}