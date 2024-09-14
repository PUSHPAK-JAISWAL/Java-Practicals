package InheritanceAndPolymorphism.Inheritance;

interface CanFly {
    void fly();
}

interface CanSwim {
    void swim();
}

class Duck implements CanFly, CanSwim {
    @Override
    public void fly() {
        System.out.println("The duck can fly.");
    }

    @Override
    public void swim() {
        System.out.println("The duck can swim.");
    }
}

public class Inheritance3 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly(); 
        duck.swim(); 
    }
}
