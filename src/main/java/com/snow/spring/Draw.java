package com.snow.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Draw {
    public static void main(String[] args) {
        /*  Instantiation of bean factory
            BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
            Triangle t = (Triangle) factory.getBean("triangle");
            t.draw();
        */

        //Application context
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring.xml");
        BeanFactory beanFactory = (BeanFactory) applicationContext;
        Triangle triangle = (Triangle) beanFactory.getBean("triangle");
        triangle.draw();

        //Print the preset variable value
       System.out.println(triangle.getType());

    }
}