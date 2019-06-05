package com.lambdaschool;

public class Bird extends Mammal
{
    public Bird(int id, String name, int year)
    {
        super(id, name, year);
    }

    @Override
    public void eat(String food)
    {
        System.out.println("I'm eating " + food);
    }

    @Override
    public void move()
    {
        System.out.println("I'm moving too");
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
}
