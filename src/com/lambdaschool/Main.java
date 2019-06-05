package com.lambdaschool;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main
{
    public static void printMammals(ArrayList<Animal> animal, CheckMammal tester)
    {
        for(Animal a : animal)
        {
            if(tester.test(a))
            {
                System.out.println(a);
            }
        }
    }

    public static void main(String[] args) {
//        System.out.println("Here");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Mammal(1, "Panda", 1869));
        animals.add(new Mammal(2, "Zebra", 1778));
        animals.add(new Mammal(3, "Koala", 1816));
        animals.add(new Mammal(4, "Sloth", 1804));
        animals.add(new Mammal(5, "Armadillo", 1758));
        animals.add(new Mammal(6, "Raccoon", 1758));
        animals.add(new Mammal(7, "Big foot", 2021));
        animals.add(new Bird(1, "Pigeon", 1869));
        animals.add(new Bird(2, "Peacock", 1778));
        animals.add(new Bird(3, "Toucan", 1816));
        animals.add(new Bird(4, "Parrot", 1804));
        animals.add(new Bird(5, "Swan", 1758));
        animals.add(new Fish(1, "Salmon", 1869));
        animals.add(new Fish(2, "Catfish", 1778));
        animals.add(new Fish(3, "Perch", 1816));

        System.out.println("*** List all the animals in descending order by year named ***");
        animals.sort((m1, m2) -> m2.getYear() - m1.getYear());
        animals.forEach(animal -> System.out.println(animal));
        System.out.println("*** List all the animals alphabetically ***");
        animals.sort((m1, m2) -> m1.getName().compareToIgnoreCase(m2.getName()));
        animals.forEach(animal -> System.out.println(animal));
        System.out.println("*** List all the animals order by how they move ***");
        animals.sort((m1, m2) -> m1.breath().compareToIgnoreCase(m2.breath()));
        animals.forEach(animal -> System.out.println(animal));
        System.out.println("*** List only those animals the breath with lungs ***");
        printMammals(animals, a -> a.breath() == "lungs");
        System.out.println("*** List only those animals that breath with lungs and were named in 1758 ***");
        printMammals(animals, a -> a.breath() == "lungs" && a.getYear() == 1758);
        System.out.println("*** List only those animals that lay eggs and breath with lungs ***");
        printMammals(animals, a -> a.breath() == "lungs" && a.reproduce() == "eggs");
        System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
        printMammals(animals, a -> a.getYear() == 1758);
        System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
        printMammals(animals, a -> a instanceof Mammal);
    }
}
