package com.lambdaschool;

abstract public class Animal
{
    // Abstract methods (does not have BODY)
    public abstract void eat(String food);
    public abstract void move();
    public abstract String breath();
    public abstract String reproduce();
//    Abstract attributes
    private int id;
    private String name;
    private int year;

    public Animal(int id, String name, int year){
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public int getYear()
    {
        return year;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString(){
        return "ID: " + id + ", Name: " + name + ", Year: " + year;
    }

}
