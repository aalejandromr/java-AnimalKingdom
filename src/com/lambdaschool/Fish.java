package com.lambdaschool;

public class Fish extends Animal
{
    public Fish(int id, String name, int year)
    {
        super(id, name, year);
    }

    @Override
    public void eat(String food)
    {
//        super.eat(food);
        System.out.println("I'm eating " + food);
    }

    @Override
    public void move()
    {
//        super.move();
        System.out.println("I'm swimming");
    }

    @Override
    public String breath()
    {
//        super.breath();
        return "gills";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
}
