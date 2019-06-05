package com.lambdaschool;

public class Mammal extends Animal
{

    public Mammal(int id, String name, int year)
    {
        super(id, name, year);
    }

    @Override
    public void eat(String food)
    {
        System.out.println("just ate " + food);
    }

    @Override
    public void move()
    {
        System.out.println("I just moved");
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }
}
