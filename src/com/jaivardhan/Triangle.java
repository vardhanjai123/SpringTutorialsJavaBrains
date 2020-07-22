package com.jaivardhan;

public class Triangle {

    private String type;
    private int height;

    public Triangle(int height,String type) {
        this.type = type;
        this.height=height;
    }

    public Triangle(int height)
    {
        System.out.println("Inside Triangle constructor");
        this .height=height;
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }
    //    public void setType(String type) {
//        this.type = type;
//    }

    public void draw()
    {
        System.out.println("Type of Triangle is "+getType()+" and its height is "+getHeight());
    }

}
