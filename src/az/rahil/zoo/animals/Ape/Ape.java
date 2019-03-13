package az.rahil.zoo.animals.Ape;

import az.rahil.zoo.animals.Animal;

public abstract class Ape extends Animal {
    public Ape(String name,String gender, int age, String[] eats, int health, int lifeExpectancy, int waste) {
        super(name,gender, age, eats, health, lifeExpectancy, waste);
    }
}
