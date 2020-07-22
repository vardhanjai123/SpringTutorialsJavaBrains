package com.jaivardhan;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
    public static void main(String[] args) {
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle= (Triangle) beanFactory.getBean("triangle");
        triangle.draw();
    }
}
