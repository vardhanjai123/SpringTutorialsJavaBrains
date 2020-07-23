package com.jaivardhan;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

public class Triangle implements InitializingBean, DisposableBean {

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


    @Override
    public void destroy() throws Exception {
        System.out.println("Hello This is Disposable Bean init() method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Hello this is Initializing Bean destroy() method");
    }
}
