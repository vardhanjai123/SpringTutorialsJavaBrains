package com.jaivardhan;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {
       // AbstractApplicationContext context=new ClassPathXmlApplicationContext();
//        context.registerShutdownHook();
//        Triangle triangle= (Triangle) context.getBean("triangle1");
//        triangle.draw();

        ApplicationContext ctx=new AnnotationConfigApplicationContext(PersonConfig.class);

        Person person= (Person) ctx.getBean(Person.class);
        Person person1= (Person) ctx.getBean("personSingleton");
        person.setName("Haivardhan");
        Person person2= (Person) ctx.getBean("personSingleton");
        System.out.println(person.toString());
        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}
