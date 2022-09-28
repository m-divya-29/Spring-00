package com.snow.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Draw {
    public static void main(String[] args) {
        //Instantiation of bean factory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        BeanFactory beanFactory = (BeanFactory) applicationContext;
        Triangle triangle = (Triangle) beanFactory.getBean("triangle");
        triangle.draw();


    }
}
