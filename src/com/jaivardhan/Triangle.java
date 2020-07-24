package com.jaivardhan;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;


public class Triangle implements InitializingBean,DisposableBean  {

   private Point pointA;
   private Point pointB;
   private Point pointC;

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

    @Required
    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw()
    {
            System.out.println("Point A=("+pointA.getX()+","+pointA.getY()+")");
            System.out.println("Point A=("+pointB.getX()+","+pointB.getY()+")");
            System.out.println("Point A=("+pointC.getX()+","+pointC.getY()+")");

    }
   public void myInit() {
       System.out.println("Hello This is init method called from xml file");
   }
   public void myDestroy(){
       System.out.println("Hello This is destroy method called from xml file");
   }

    @Override
    public void destroy() throws Exception {
        System.out.println("Hello This is Disposable Bean destroy() method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Hello this is Initializing Bean init() method");
    }
}
