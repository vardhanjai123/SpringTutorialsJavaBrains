package com.jaivardhan;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware {

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext applicationContext;

    public Point getPointA() {
        return pointA;
    }

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

    public void draw()
    {
            System.out.println("Point A=("+pointA.getX()+","+pointA.getY()+")");
            System.out.println("Point B=("+pointB.getX()+","+pointB.getY()+")");
            System.out.println("Point C=("+pointC.getX()+","+pointC.getY()+")");


    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
        complete();
    }

    public void complete()
    {
     pointA= (Point) applicationContext.getBean("pointA");
     pointB= (Point) applicationContext.getBean("pointB");
     pointC= (Point) applicationContext.getBean("pointC");
    }
}
