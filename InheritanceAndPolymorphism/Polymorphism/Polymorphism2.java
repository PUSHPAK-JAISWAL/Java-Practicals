package InheritanceAndPolymorphism.Polymorphism;

class Animal {
    void sound() {
        System.out.println("This is a generic animal sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        Animal myAnimal; 
        
        myAnimal = new Dog();
        myAnimal.sound();  

        
        myAnimal = new Cat();
        myAnimal.sound(); 
    }
}
