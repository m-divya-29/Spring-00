package com.snow.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Draw {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //Register a shutdown hook with the JVM runtime, closing this context on JVM shutdown
        context.registerShutdownHook(); //Required such that all destroy(implemented, custom and default) methods are called.
        Shape shape = (Shape) context.getBean("triangle-alias");
        shape.draw();
    }
}