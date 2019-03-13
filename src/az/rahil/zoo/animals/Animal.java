package az.rahil.zoo.animals;

import java.util.Arrays;

public abstract class Animal {
    private String name;
    private String gender;
    private int age;
    private String[] eats;
    private int health;
    private int lifeExpectancy;
    private int waste;


    public Animal() {
    }

    public Animal(String name, int age, int health, int lifeExpectancy, int waste) {
        this.name = name;
        this.age = age;
        this.health = health;
        this.lifeExpectancy = lifeExpectancy;
        this.waste = waste;
    }

    public Animal(String name, String gender, int age, String[] eats, int health, int lifeExpectancy, int waste) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.eats = eats;
        this.health = health;
        this.lifeExpectancy = lifeExpectancy;
        this.waste = waste;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getEats() {
        return eats;
    }

    public void setEats(String[] eats) {
        this.eats = eats;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }


    public int getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public boolean canEat(String eat) {
        return false;
    }

    public boolean eat() {
        return false;
    }

    public boolean decreaseHealth() {
        return false;
    }

    public boolean treat() {
        return false;
    }

    public abstract boolean aMonthPasses();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", eats=" + Arrays.toString(eats) +
                ", health=" + health +
                ", lifeExpectancy=" + lifeExpectancy +
                ", waste=" + waste +
                '}';
    }

}
