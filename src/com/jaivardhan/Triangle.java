package com.jaivardhan;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

public class Triangle implements InitializingBean,DisposableBean  {

    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw()
    {
        for(Point p:points)
            System.out.println("Point A=("+p.getX()+","+p.getY()+")");

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
