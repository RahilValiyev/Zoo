package az.rahil.zoo.animals.Ape;

public class Gorilla extends Ape {
    public Gorilla( String name,String gender, int age, String[] eats, int health, int lifeExpectancy, int waste) {
        super(name,gender, age, eats, health, lifeExpectancy, waste);
    }

    @Override
    public boolean aMonthPasses() {
        return false;
    }
}
