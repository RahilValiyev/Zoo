package az.rahil.zoo.animals.BigCat;

public class Tiger extends BigCat {
    public Tiger(String name,String gender, int age, String[] eats, int health, int lifeExpectancy, int waste) {
        super(name,gender, age, eats, health, lifeExpectancy, waste);
    }

    @Override
    public boolean aMonthPasses() {
        return false;
    }
}
