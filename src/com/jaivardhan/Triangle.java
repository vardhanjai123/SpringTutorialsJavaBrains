package com.jaivardhan;


import java.util.List;

public class Triangle  {

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




}
