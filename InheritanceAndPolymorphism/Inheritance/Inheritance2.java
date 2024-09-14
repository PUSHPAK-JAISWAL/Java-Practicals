package InheritanceAndPolymorphism.Inheritance;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting.");
    }

    void honk() {
        System.out.println("Car horn honks.");
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); 
        car.honk(); 
    }
}
