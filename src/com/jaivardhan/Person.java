package com.jaivardhan;

public class Person {
    private String name;

    public Person()
    {

    }


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public void myInit()
    {
        System.out.println("This is init method of Person Class");
    }

    public void myDestroy()
    {
        System.out.println("This is the destroy method of Person Class");
    }

}
