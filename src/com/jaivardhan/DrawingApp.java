package com.jaivardhan;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        Triangle triangle= (Triangle) context.getBean("triangle1");
        triangle.draw();
    }
}
